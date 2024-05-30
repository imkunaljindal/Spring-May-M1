package com.example.VaccineNation.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PatientResponse {

    private String name;

    private boolean vaccinated;

    private String emailId;
}
