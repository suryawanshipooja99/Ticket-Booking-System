package com.example.ticketbookingsys.entity;

import java.sql.Date;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Ticket {

    @Id
    @GeneratedValue
    private int id;
    @JsonFormat(pattern = "dd/mm/yyyy")
    private Date startDate;
    @JsonFormat(pattern = "dd/mm/yyyy")
    private Date endDate;
    private Long cost;
    private String note;

    @ManyToOne
    @JsonBackReference
    @ToString.Exclude
    @JoinColumn(name = "user_id")
    private User user;

}
