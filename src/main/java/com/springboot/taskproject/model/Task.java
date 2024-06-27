package com.springboot.taskproject.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="task")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="taskName",nullable = false)
    private String taskName;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="user_id")
    private Users users;


}
