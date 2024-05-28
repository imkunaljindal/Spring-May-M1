package com.example.VaccineNation.controller;

import com.example.VaccineNation.model.Patient;
import com.example.VaccineNation.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/patient")
public class PatientController {

    @Autowired
    PatientService patientService;

    @PostMapping("/add")
    public String addPatient(@RequestBody Patient patient) {
        try{
            patientService.addPatient(patient);
            return "Patient has been added";
        }
        catch (Exception e) {
            return "Some issue while registering the patient";
        }
    }

    @GetMapping("/get")
    public Patient getPatient(@RequestParam("id") int id) {
         return patientService.getPatient(id);
    }
}
