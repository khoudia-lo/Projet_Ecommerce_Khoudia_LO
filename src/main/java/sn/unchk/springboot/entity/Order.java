package sn.unchk.springboot.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "orders")
@Getter
@Setter
@NoArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date date;
    private int quantity;
    private double totalPrice;

    // Relation : Une commande appartient à un seul client
    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    // Relation : Une commande contient plusieurs détails
    @OneToMany(mappedBy = "order")
    private List<OrderDetails> orderDetails;
}