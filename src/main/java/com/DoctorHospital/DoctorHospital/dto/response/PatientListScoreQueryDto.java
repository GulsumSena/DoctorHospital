package com.DoctorHospital.DoctorHospital.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class PatientListScoreQueryDto {
	private String namePatient;
	private Integer agePatient;
	private String gender;
	private Long patientID;
	private String nameScore;
	private String nameDoctor;
	private Long doctorID;
}
