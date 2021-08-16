package basic.springBasic1st;

import basic.springBasic1st.repository.MemberRepository;
import basic.springBasic1st.repository.MemoryMemberRepository;
import basic.springBasic1st.repository.jdbcMemberRepository;
import basic.springBasic1st.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class springConfing {

    private DataSource dataSource;

    @Autowired
    public springConfing(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
//        return new MemoryMemberRepository();
        return new jdbcMemberRepository(dataSource);
    }
}
