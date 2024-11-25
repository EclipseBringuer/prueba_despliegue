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
@Table(name = ApplicationConstants.PRODUCT_TABLE_NAME)
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    private Double price;

    private String category;

    private String image;

    private Integer stock;
}
