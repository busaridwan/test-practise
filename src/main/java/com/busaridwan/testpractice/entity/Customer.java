package com.busaridwan.testpractice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "CUSTOMER_DATA")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String firstName;
    private String lastName;
    private String middleName;
    private int age;
    private String email;
    private String phone;
    private AccessType type;
    @Lob
    @Column(name = "mandate",length = 1000)
    private byte[] mandate;
}
