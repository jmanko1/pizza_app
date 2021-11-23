package pl.jakub.pizza.data.entity.pizza;

import pl.jakub.pizza.data.entity.size.SizeEntity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "pizzas")
public class PizzaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    //1 pizza can have many sizes
    @OneToMany(mappedBy = "pizza")
    private Set<SizeEntity> sizes;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
