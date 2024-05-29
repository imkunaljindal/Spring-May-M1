package com.example.VaccineNation.controller;

import com.example.VaccineNation.model.Patient;
import com.example.VaccineNation.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/patient")
public class PatientController {

    @Autowired
    PatientService patientService;

    @PostMapping("/add")
    public ResponseEntity addPatient(@RequestBody Patient patient) {
        try{
            Patient savedPatient = patientService.addPatient(patient);
            return new ResponseEntity<>(savedPatient,HttpStatus.CREATED);
        }
        catch (Exception e) {
            return new ResponseEntity<>("Invalid request",HttpStatus.NOT_ACCEPTABLE);
        }
    }

    @GetMapping("/get")
    public Patient getPatient(@RequestParam("id") int id) {
         return patientService.getPatient(id);
    }
}
