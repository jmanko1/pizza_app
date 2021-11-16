package pl.jakub.pizza.data.entity.ordersize;

import javax.persistence.*;

@Entity
@Table(name = "orders_sizes")
public class OrderSizeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "size_id")
    private Integer sizeId;

    @Column(name = "order_id")
    private Integer orderId;

    @Column(name = "count")
    private Integer count;

}
