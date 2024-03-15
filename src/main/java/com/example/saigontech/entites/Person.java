package com.example.saigontech.entites;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "PERSONS")
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Inheritance(strategy = InheritanceType.JOINED)
@Data
public class Person {
    @Id
    @GeneratedValue
    Long id;

    @Column(name = "SESSION_ID")
    String sessionId;
}
