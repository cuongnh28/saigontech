package com.example.saigontech.entites;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "DOCUMENTS")
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Data
@DiscriminatorColumn(name = "DOC_TYPE", discriminatorType = DiscriminatorType.STRING)
public class Document {
    @Id
    @GeneratedValue
    @Column(name = "DOC_ID")
    Long id;

    @Column(name = "REFERENCE_ID")
    String referenceId;

    @Column(name = "AUTHOR_NAME")
    String authorName;
}
