package basic.springBasic1st;

import basic.springBasic1st.repository.MemberRepository;
import basic.springBasic1st.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class springConfing {

//    private DataSource dataSource;
    // JPA를 사용하기 위한 설정
//    private EntityManager em;s

//    @Autowired
//    public springConfing(EntityManager em) {
//        this.em = em;
//    }

    //    @Autowired
//    public springConfing(DataSource dataSource) {
//        this.dataSource = dataSource;
//    }

    //    @Bean
//    public MemberRepository memberRepository() {
//        return new MemoryMemberRepository();
//        return new jdbcMemberRepository(dataSource);
//        return new JdbcTemplateMemberRepository(dataSource);
//        return new JpaMemberRepository(em);
//    }

    //SpringData Jpa 사용
    private final MemberRepository memberRepository;

    @Autowired
    public springConfing(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository);
    }

//    @Bean
//    public TimeTraceAop timeTraceAop() {
//        return new TimeTraceAop();
//    }
}
