package com.DoctorHospital.DoctorHospital.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DoctorQueryDto {
	private String nameDoctor;
	private Long branchID;
	private Long doctorID;
}
