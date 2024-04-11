package com.DoctorHospital.DoctorHospital.model.score;


import com.DoctorHospital.DoctorHospital.model.Score;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Alvarado extends Score{
	private Long id;
	private Integer pain;
	private Integer lossOfAppetite;
	private Integer vomiting;
	private Integer abdominalSensivity;
	private Integer rebound;
	private Integer feverAl;
	private Integer leukocytosis;
	private Integer leftShift;
	private Integer totalOfAlvarado;

	
}
