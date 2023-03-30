package omok_project.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
public class Member {
    @Id @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    @Column(name = "nickname")
    private String name;

    private String profile_msg;

    private String email;

    private LocalDateTime create_at;

    private LocalDateTime last_visit;

    // 신고 누적을 파악하기 위해서는 이방법이 좀더 편할거 같다고 생각
    @OneToMany(mappedBy = "violation_member")
    private List<Reporting> reports = new ArrayList<>();

    @OneToMany(mappedBy = "member")
    private List<MemberHistoryRelation> histories = new ArrayList<>();
}
