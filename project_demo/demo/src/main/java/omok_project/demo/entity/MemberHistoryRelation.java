package omok_project.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
public class MemberHistoryRelation {
    @Id @GeneratedValue
    @Column(name = "member_history_relation_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "history_id")
    private History history;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_away_id")
    private Member member_away;

    private String result;
    // 어짜피 내 기준으로 게임을 가져오는 것이므로 0이면 나 1이면 상대로 구분
    // History엔티티에 member_id를 넣는거는 좀 구조가 이상한듯?
    private Boolean first_turn;


}
