package jpabook.jpashop.domain.item;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "dtype")
@Getter @Setter
public class Item {

    @Column(name = "item_id")
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private int price;
    private int stockQuantity;
}
