package com.example.saigontech;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Entity
@Table(name = "DOCUMENTS")
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
public class Document {
    @Id
    @GeneratedValue
    @Column(name = "DOC_ID")
    Long id;

    @Column(name = "REFERENCE_ID")
    String referenceId;

    @Column(name = "AUTHOR_NAME")
    String authorName;

    @Column(name = "BEGIN")
    Date begin;

    @Column(name = "FINISH")
    Date endDate;

    @Column(name = "PAY_DATE")
    Date paymentDate;

    @Column(name = "DOC_TYPE")
    @Enumerated(EnumType.STRING)
    DocType docType;

}
