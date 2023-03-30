package omok_project.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity
@Getter
public class Violation {
    @Id
    @GeneratedValue
    @Column(name = "violation_id")
    private Long id;

    private String name;

    private String content;

}
