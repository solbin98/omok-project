package omok_project.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
public class Reporting {
    @Id @GeneratedValue
    @Column(name = "reporting_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "violation_id")
    private Violation violation;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "violation_member_id")
    private Member violation_member;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "reporting_member_id")
    private Member reporting_member;

    //2023-03-22 회의 후 content 추가
    private String content;

    private Boolean handled;

}
