package com.daw.despliegue.model;

import com.daw.despliegue.constants.ApplicationConstants;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = ApplicationConstants.CUSTOMER_TABLE_NAME)
public class Customer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String token;

    private String name;

    private String email;

    private String phone;

    private String address;

    private String password;

    @OneToMany(mappedBy = ApplicationConstants.ORDER_CUSTOMER_RELATIONAL_FIELD_NAME, cascade = CascadeType.ALL)
    private List<Order> orders = new ArrayList<>();
}
