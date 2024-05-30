package com.example.VaccineNation.service;

import com.example.VaccineNation.Enum.Gender;
import com.example.VaccineNation.dto.request.PatientRequest;
import com.example.VaccineNation.dto.response.PatientResponse;
import com.example.VaccineNation.exception.PatientNotFoundException;
import com.example.VaccineNation.model.Patient;
import com.example.VaccineNation.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PatientService {

    @Autowired
    PatientRepository patientRepository;

    public PatientResponse addPatient(PatientRequest patientRequest) {

        // 1. request dto -> model/entity
        Patient patient = new Patient();
        patient.setVaccinated(false);
        patient.setName(patientRequest.getName());
        patient.setAge(patientRequest.getAge());
        patient.setEmailId(patientRequest.getEmailId());
        patient.setGender(patientRequest.getGender());

        Patient savedPatient = patientRepository.save(patient);// returns saved patient

        // convert model -> response dto
        PatientResponse patientResponse = new PatientResponse();
        patientResponse.setName(savedPatient.getName());
        patientResponse.setVaccinated(savedPatient.isVaccinated());
        patientResponse.setEmailId(savedPatient.getEmailId());

        return patientResponse;
    }

    public PatientResponse getPatient(int id) {
        Optional<Patient> patientOptional = patientRepository.findById(id);  //searches based on P.K.

        if(patientOptional.isEmpty()) {
            throw new PatientNotFoundException("Invalid patient id");
        }
        Patient patient = patientOptional.get();
        PatientResponse patientResponse = new PatientResponse();
        patientResponse.setName(patient.getName());
        patientResponse.setVaccinated(patient.isVaccinated());
        patientResponse.setEmailId(patient.getEmailId());
        return patientResponse;

    }

    public List<PatientResponse> getAllPatientsByGender(Gender gender) {
        List<Patient> patients = patientRepository.findAll();

        List<PatientResponse> patientResponses = new ArrayList<>();
        for(Patient patient: patients) {
            if(patient.getGender()==gender) {
                PatientResponse patientResponse = new PatientResponse();
                patientResponse.setName(patient.getName());
                patientResponse.setVaccinated(patient.isVaccinated());
                patientResponse.setEmailId(patient.getEmailId());
                patientResponses.add(patientResponse);
            }
        }

        return patientResponses;
    }
}
