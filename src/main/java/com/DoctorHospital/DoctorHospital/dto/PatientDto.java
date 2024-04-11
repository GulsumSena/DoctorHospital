package com.DoctorHospital.DoctorHospital.dto;

import java.util.List;

import com.DoctorHospital.DoctorHospital.model.ClinicInfo;
import com.DoctorHospital.DoctorHospital.model.DeathNote;
import com.DoctorHospital.DoctorHospital.model.Doctor;
import com.DoctorHospital.DoctorHospital.model.Score;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PatientDto {
	private Long id;
	private String namePatient;
	private String gender;
	private Integer agePatient;
	private Doctor doctor;
	private Integer status;
	private DeathNote note;
	private List<Score> scores;
	private List<ClinicInfo> infos;

}
