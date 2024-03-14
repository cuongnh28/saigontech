package com.example.saigontech;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "USERS")
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
public class AppUser extends Person {
    @Column(name = "PERSON_ID")
    String personId;

    @Column(name = "LOGIN")
    Boolean login;

    @Column(name = "USERNAME")
    String firstName;

    @Column(name = "USER_SURNAME")
    String lastName;
}
