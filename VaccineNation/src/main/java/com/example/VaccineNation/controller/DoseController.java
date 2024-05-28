package com.example.VaccineNation.controller;

import com.example.VaccineNation.Enum.VaccineBrand;
import com.example.VaccineNation.model.Dose;
import com.example.VaccineNation.service.DoseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dose")
public class DoseController {

    @Autowired
    DoseService doseService;

    @PostMapping("/vaccinate")
    public Dose addDose(@RequestParam("id") int patientId,
                   @RequestParam("brand") VaccineBrand vaccineBrand) {
        return doseService.addDose(patientId,vaccineBrand);
    }

    // homework
    // 1) Make entity relationships
    // 2) Make doctor APIs
    // 3) Make api to vaccinate a patient
}
