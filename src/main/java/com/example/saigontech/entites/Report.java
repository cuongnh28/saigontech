package com.example.saigontech.entites;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Entity
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
@DiscriminatorValue("REP")
public class Report extends Document {
     @Column(name = "BEGIN")
    private Instant startDate;

    @Column(name = "FINISH")
    private Instant endDate;
}
