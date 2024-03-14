package com.example.saigontech;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "EPICS")
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
public class Epic extends Task {
    @Column(name = "PROJECT_ID")
    String projectId;
    @Column(name = "PRODUCT_OWNER_NAME")
    String productOwner;
}
