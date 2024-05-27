package com.example.VaccineNation.service;

import com.example.VaccineNation.model.Patient;
import com.example.VaccineNation.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService {

    @Autowired
    PatientRepository patientRepository;

    public void addPatient(Patient patient) {
        patientRepository.save(patient); // returns saved patient
    }
}
