package com.example.saigontech.controller.dto;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    private String title;

    private String description;

    private TaskStatus status;

    public Task(String title) {
        this.title = title;
    }

    public TaskDto toDto() {
        return new TaskDto(id, title, description, status.toString());
    }
}
