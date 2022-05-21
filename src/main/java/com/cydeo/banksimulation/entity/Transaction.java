package com.cydeo.banksimulation.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "transactions")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private Account sender;

    @ManyToOne(fetch = FetchType.LAZY)
    private Account receiver;
    private BigDecimal amount;
    private String message;

    @Column(columnDefinition = "DATE")
    private Date creationDate;

}
