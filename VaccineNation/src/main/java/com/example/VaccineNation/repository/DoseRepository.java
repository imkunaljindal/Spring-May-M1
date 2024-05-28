package com.example.VaccineNation.repository;

import com.example.VaccineNation.model.Dose;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoseRepository extends JpaRepository<Dose,Integer> {
}
