package com.example.saigontech.entites;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
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
@PrimaryKeyJoinColumn(name = "PERSON_ID")
public class AppUser extends Person {
    @Column(name = "LOGIN")
    Boolean login;

    @Column(name = "USERNAME")
    String firstName;

    @Column(name = "USER_SURNAME")
    String lastName;
}
