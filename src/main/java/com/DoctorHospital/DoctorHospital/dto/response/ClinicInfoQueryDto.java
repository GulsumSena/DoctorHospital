package com.DoctorHospital.DoctorHospital.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClinicInfoQueryDto {
	private Long patient_id;
	private Long doctor_id;
	private String body;
	private String time;
	private String nameDoctor;
	private String namePatient;
}
