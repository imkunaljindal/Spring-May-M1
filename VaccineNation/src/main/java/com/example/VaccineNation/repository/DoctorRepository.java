package com.example.VaccineNation.repository;

import com.example.VaccineNation.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor,Integer> {
}
