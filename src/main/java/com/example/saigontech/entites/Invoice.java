package com.example.saigontech.entites;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Entity
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
@DiscriminatorValue("INV")
public class Invoice extends Document {
    @Column(name = "PAY_DATE")
    private Instant paymentDate;
}
