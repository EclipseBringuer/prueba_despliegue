package com.daw.despliegue.model;

import com.daw.despliegue.constants.ApplicationConstants;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = ApplicationConstants.ORDER_TABLE_NAME)
public class Order implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime orderDate;

    private String status;

    private Double totalAmount;

    @OneToMany(mappedBy = ApplicationConstants.ITEM_ORDER_RELATIONAL_FIELD_NAME, cascade = CascadeType.ALL)
    private List<Item> items = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = ApplicationConstants.CUSTOMER_ID_COLUMN)
    private Customer customer;
}
