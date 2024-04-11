package com.DoctorHospital.DoctorHospital.dto.request;

import com.DoctorHospital.DoctorHospital.model.Branch;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DrListRequestDto {
	private String name;
	@JsonIgnore
	private Branch branch;
}
