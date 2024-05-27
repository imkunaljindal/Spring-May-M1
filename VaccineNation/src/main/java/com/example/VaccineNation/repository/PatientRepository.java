package com.example.VaccineNation.repository;

import com.example.VaccineNation.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Integer> {
}
