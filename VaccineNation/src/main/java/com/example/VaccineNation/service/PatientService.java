package com.example.VaccineNation.service;

import com.example.VaccineNation.exception.PatientNotFoundException;
import com.example.VaccineNation.model.Patient;
import com.example.VaccineNation.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PatientService {

    @Autowired
    PatientRepository patientRepository;

    public Patient addPatient(Patient patient) {
        return patientRepository.save(patient); // returns saved patient
    }

    public Patient getPatient(int id) {
        Optional<Patient> patientOptional = patientRepository.findById(id);  //searches based on P.K.

        if(patientOptional.isEmpty()) {
            throw new PatientNotFoundException("Invalid patient id");
        }

        Patient patient = patientOptional.get();
        return patient;

    }
}
