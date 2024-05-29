package com.example.VaccineNation.model;

import com.example.VaccineNation.Enum.AppointmentStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String appointmentId;

    @CreationTimestamp
    private Date dateOfApppointment;

    @Enumerated(value = EnumType.STRING)
    private AppointmentStatus status;

    @ManyToOne
    @JoinColumn
    Doctor doctor;

    @OneToOne
    @JoinColumn
    Patient patient;
}
