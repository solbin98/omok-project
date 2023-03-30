package omok_project.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;

import java.time.LocalDateTime;

@Entity
@Getter
public class File {
    @Id @GeneratedValue
    @Column(name = "file_id")
    private Long id;

    private String original_name;

    private String name;

    private String type;

    private String size;

    private String path;

    private LocalDateTime created_at;

}
