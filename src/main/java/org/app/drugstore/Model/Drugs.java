package org.app.drugstore.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "drugs")
public class Drugs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(name = "drug_name")
    String drugName;

    @Column(name= "quantity" , nullable = false)
    int quantity;

    @Column(name = "price")
    double price;

    @Column(name = "availability")
    boolean availability;

    @OneToMany(mappedBy = "drugs")
    Set<Order> orders = new HashSet<>();
}
