package basic.springBasic01.service;

import basic.springBasic01.domain.Member;
import basic.springBasic01.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

//@Service
@Transactional
public class MemberService {

    private final MemberRepository memberRepository;

    @Autowired
    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    /*
     * 회원 가입
     */
    public Long join(Member member) {
        // 같은 이름이 있는 중복 회원 x
        validateDupplMember(member); // 중복회원검색
        memberRepository.save(member);
        return member.getId();
    }

    private void validateDupplMember(Member member) {
        memberRepository.findByName(member.getName())
            .ifPresent(m -> {
                throw new IllegalStateException("이미 존재하는 회원입니다.");
            });
    }

    /*
     * 전체회원조회
     */
    public List<Member> findMembers() {
        return memberRepository.findAll();
    }

    /*
     * 한 회원 조회
     */
    public Optional<Member> findOne(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
