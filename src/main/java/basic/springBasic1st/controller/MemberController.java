package basic.springBasic1st.controller;

import basic.springBasic1st.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

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
    }
}
