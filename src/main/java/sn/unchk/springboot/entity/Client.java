package sn.unchk.springboot.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstname;
    private String lastname;
    private String email;

    @OneToMany(mappedBy = "client")
    private List<Order> orders;
}