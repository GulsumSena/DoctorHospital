package com.DoctorHospital.DoctorHospital.dto.response;

import java.util.List;

import com.DoctorHospital.DoctorHospital.dto.request.DrListRequestDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BranchWDrDto {
	private String nameBranch;
	private List<DrListRequestDto> doctors;
}
