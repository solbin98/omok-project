package omok_project.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity
@Getter
public class Rule {
    @Id @GeneratedValue
    @Column(name = "rule_id")
    private Long id;

    private String name;

    private String explain;
}
