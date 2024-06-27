package com.springboot.taskproject.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@Table(name="users",uniqueConstraints = @UniqueConstraint(columnNames = {"email"}))
@AllArgsConstructor
@NoArgsConstructor
public class Users {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        @Column(name = "name", nullable = false)
        private String name;
        @Column(name = "email", nullable = false)
        private String email;
        @Column(name = "password", nullable = false)
        private String password;

    }

