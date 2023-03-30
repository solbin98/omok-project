package omok_project.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
public class MemberFileRelation {
    @Id @GeneratedValue
    @Column(name = "member_file_relation_id")
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "file_id")
    private File file;
}
