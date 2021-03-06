package basic.springBasic01.controller;

import basic.springBasic01.domain.Member;
import basic.springBasic01.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class MemberController {

    private MemberService memberService;

    // Setter 방식(DI)
//    @Autowired
//    public void setMemberService(MemberService memberService) {
//        this.memberService = memberService;
//    }

    // 생성자 주입방식
    @Autowired
    public MemberController(MemberService memberservice) {
        this.memberService = memberservice;
        System.out.println("memberService : " + memberservice.getClass());
        // WAS가 실행될때 DI 주입
        // memberService : class basic.springBasic1st.service.MemberService$$EnhancerBySpringCGLIB$$2b07773d
    }

    @GetMapping("/members/new")
    public String createForm() {
        return "members/createMemberForm";
    }

    @PostMapping("/members/new")
    public String createMemeberForm(MemberForm form) {
        System.out.println("getName : " + form.getName());

        Member member = new Member();
        member.setName(form.getName());

        System.out.println("member name : " + member.getName());

        memberService.join(member);

        return "redirect:/";
    }

    @GetMapping("/members")
    public String listMember(Model model) {
        List<Member> listMembers = memberService.findMembers();
        model.addAttribute("listMembers", listMembers);
        return "members/memberList";
    }
}
