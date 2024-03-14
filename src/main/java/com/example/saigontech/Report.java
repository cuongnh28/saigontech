package com.example.saigontech;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Entity
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
public class Report extends Document {
    @Id
    @GeneratedValue
    Long id;
    LocalDate startDate;
    LocalDate endDate;

    @Override
    public String getAuthorName() {
        return "NO AUTHOR";
    }
}
