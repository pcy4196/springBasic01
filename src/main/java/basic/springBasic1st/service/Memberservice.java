package basic.springBasic1st.service;

import basic.springBasic1st.domain.Member;
import basic.springBasic1st.repository.MemberRepository;
import basic.springBasic1st.repository.MemoryMemberRepository;

import java.util.List;
import java.util.Optional;

public class Memberservice {

    private final MemberRepository memberRepository = new MemoryMemberRepository();

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
