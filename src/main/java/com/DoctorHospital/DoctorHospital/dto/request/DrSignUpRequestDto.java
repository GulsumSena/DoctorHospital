package com.DoctorHospital.DoctorHospital.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DrSignUpRequestDto {
	private String nameDoctor;
	private String username;
	private String password;
}
