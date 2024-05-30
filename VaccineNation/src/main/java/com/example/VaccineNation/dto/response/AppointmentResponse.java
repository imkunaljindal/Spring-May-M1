package com.example.VaccineNation.dto.response;

import com.example.VaccineNation.Enum.AppointmentStatus;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.AnyKeyJavaClass;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AppointmentResponse {

    private String appointmentId;

    private Date dateOfApppointment;

    private AppointmentStatus status;

    private PatientResponse patientResponse;

    private String doctorName;
}
