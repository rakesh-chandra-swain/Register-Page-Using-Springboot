package com.nt.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "register")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Register {
    
    @Id
    @GeneratedValue
    private Long id;
   
    private String name;
    private String email;
    private String password;

}

