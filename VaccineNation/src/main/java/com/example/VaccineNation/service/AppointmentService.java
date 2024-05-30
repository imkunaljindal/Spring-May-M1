package com.example.VaccineNation.service;

import com.example.VaccineNation.Enum.AppointmentStatus;
import com.example.VaccineNation.dto.response.AppointmentResponse;
import com.example.VaccineNation.dto.response.PatientResponse;
import com.example.VaccineNation.exception.DoctorNotFoundException;
import com.example.VaccineNation.exception.PatientNotFoundException;
import com.example.VaccineNation.model.Appointment;
import com.example.VaccineNation.model.Doctor;
import com.example.VaccineNation.model.Patient;
import com.example.VaccineNation.repository.AppointmentRepo;
import com.example.VaccineNation.repository.DoctorRepository;
import com.example.VaccineNation.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.print.Doc;
import java.util.Optional;
import java.util.UUID;

@Service
public class AppointmentService {

    @Autowired
    PatientRepository patientRepository;

    @Autowired
    DoctorRepository doctorRepository;

    @Autowired
    AppointmentRepo appointmentRepo;

    public AppointmentResponse bookAppointment(int patientId, int doctorId) {
        Optional<Patient> patientOptional = patientRepository.findById(patientId);
        if(patientOptional.isEmpty()) {
            throw new PatientNotFoundException("Invalid patient id");
        }

        Optional<Doctor> doctorOptional = doctorRepository.findById(doctorId);
        if(doctorOptional.isEmpty()) {
            throw new DoctorNotFoundException("Invalid doctor id");
        }

        Patient patient = patientOptional.get();
        Doctor doctor = doctorOptional.get();

        // book the appointment
        Appointment appointment = new Appointment();
        appointment.setAppointmentId(String.valueOf(UUID.randomUUID()));
        appointment.setStatus(AppointmentStatus.BOOKED);
        appointment.setDoctor(doctor);
        appointment.setPatient(patient);

        Appointment savedAppiontment = appointmentRepo.save(appointment);

        // model to response dto
        AppointmentResponse appointmentResponse = new AppointmentResponse();
        appointmentResponse.setAppointmentId(savedAppiontment.getAppointmentId());
        appointmentResponse.setStatus(savedAppiontment.getStatus());
        appointmentResponse.setDateOfApppointment(savedAppiontment.getDateOfApppointment());
        appointmentResponse.setDoctorName(savedAppiontment.getDoctor().getName());

        Patient savedPatient = savedAppiontment.getPatient();
        PatientResponse patientResponse = new PatientResponse();
        patientResponse.setName(savedPatient.getName());
        patientResponse.setEmailId(savedPatient.getEmailId());
        patientResponse.setVaccinated(savedPatient.isVaccinated());

        appointmentResponse.setPatientResponse(patientResponse);

        return appointmentResponse;
    }
}
