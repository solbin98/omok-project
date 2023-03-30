package omok_project.demo.repository;

import omok_project.demo.entity.Member;

import java.util.List;

public interface MemberRepository {
    public void save(Member member);
    public Member findOne(Long id);
    public List<Member> findAll();
}
