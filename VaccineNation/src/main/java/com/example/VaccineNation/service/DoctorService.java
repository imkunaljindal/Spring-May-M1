package com.example.VaccineNation.service;

import com.example.VaccineNation.model.Doctor;
import com.example.VaccineNation.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorService {

    @Autowired
    DoctorRepository doctorRepository;

    public String addDoctor(Doctor doctor) {
        doctorRepository.save(doctor);
        return "Doctor saved successfully";
    }

    public String deleteDoctor(int id) {
        doctorRepository.deleteById(id);
        return "Doctor has been deleted";
    }
}