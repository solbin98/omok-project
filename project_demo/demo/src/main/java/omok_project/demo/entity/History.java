package omok_project.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;

import java.time.LocalDateTime;

@Entity
@Getter
public class History {
    @Id @GeneratedValue
    @Column(name = "history_id")
    private Long id;

    private String board_history;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "rule_id")
    private Rule rule;

    private LocalDateTime started_at;
    private LocalDateTime ended_at;
}
