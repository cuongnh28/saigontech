package com.example.saigontech;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "GUESTS")
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
public class Guest extends Person {
    @Column(name = "PERSON_ID")
    String personId;
    @Column(name = "TEMPORARY_NAME")
    String temporaryName;
}
