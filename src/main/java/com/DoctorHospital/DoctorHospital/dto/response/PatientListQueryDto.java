package com.DoctorHospital.DoctorHospital.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PatientListQueryDto {
	private Long patient_id;
	private Long doctor_id;
	private String nameDoctor;
	private String namePatient;
	private String gender;
	private Integer agePatient;
	private Integer status;
}
