package com.example.saigontech.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TaskDto {
    private Long id;
    private String title;
    private String description;
    private String status;
}
