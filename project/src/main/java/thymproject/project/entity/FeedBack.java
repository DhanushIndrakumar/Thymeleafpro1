package thymproject.project.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Data
@Table(name="feedback")
@AllArgsConstructor
@NoArgsConstructor
public class FeedBack {

    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String bookName;

    private String response;
}
