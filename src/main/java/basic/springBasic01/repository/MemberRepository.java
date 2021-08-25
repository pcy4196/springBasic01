package basic.springBasic01.repository;

import basic.springBasic01.domain.Member;

import java.util.*;

public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(Long id);
    Optional<Member> findByName(String name);
    List<Member> findAll();
}
