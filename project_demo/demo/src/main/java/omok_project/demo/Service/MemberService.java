package omok_project.demo.Service;

import omok_project.demo.entity.Member;

import java.util.List;

public interface MemberService {
    public Long join(Member member);
    public Member findOne(Long id);
    public List<Member> findAll();
}
