package basic.springBasic1st;

import basic.springBasic1st.repository.MemberRepository;
import basic.springBasic1st.repository.MemoryMemberRepository;
import basic.springBasic1st.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class springConfing {

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
