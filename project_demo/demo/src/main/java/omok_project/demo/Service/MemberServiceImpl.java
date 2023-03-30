package omok_project.demo.Service;

import lombok.RequiredArgsConstructor;
import omok_project.demo.entity.Member;
import omok_project.demo.repository.MemberRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class MemberServiceImpl implements MemberService {
    private final MemberRepository memberRepository;

    public Long join(Member member){
        // 로그인 중복 검사 로직 추가필요
        memberRepository.save(member);
        return member.getId();
    }

    @Override
    public Member findOne(Long id) {
        return memberRepository.findOne(id);
    }

    @Override
    public List<Member> findAll() {
        return memberRepository.findAll();
    }
}
