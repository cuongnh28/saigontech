package com.example.saigontech;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "PERSONS")
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
public class Person {
    @Id
    @GeneratedValue
    Long id;

    @Column(name = "SESSION_ID")
    String sessionId;
}
