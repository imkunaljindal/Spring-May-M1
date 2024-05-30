package com.example.VaccineNation.dto.request;

import com.example.VaccineNation.Enum.Gender;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PatientRequest {

    private String name;

    private int age;

    private Gender gender;

    private String emailId;
}
