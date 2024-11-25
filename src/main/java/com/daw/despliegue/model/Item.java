package com.daw.despliegue.model;

import com.daw.despliegue.constants.ApplicationConstants;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = ApplicationConstants.ITEM_TABLE_NAME)
public class Item implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double totalAmount;

    private Integer quantity;

    @ManyToOne
    @JoinColumn(name = ApplicationConstants.PRODUCT_ID_COLUMN)
    private Product product;

    @ManyToOne
    @JoinColumn(name = ApplicationConstants.ORDER_ID_COLUMN)
    private Order order;
}
