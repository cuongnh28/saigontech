package com.example.saigontech;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "STORIES")
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
public class Story extends Task {
    @Column(name = "SPRINT_ID")
    String sprintId;
}
