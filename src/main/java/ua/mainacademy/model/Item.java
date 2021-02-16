package ua.mainacademy.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@ToString
@Table(name = "items")
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Item extends BaseEntity {

    @Column(name = "item_code", nullable = false)
    private String itemCode;

    @Column(nullable = false)
    private String name;

    private Integer price;

    @Column(name = "init_price", nullable = false)
    private Integer initPrice;
}
