package com.DoctorHospital.DoctorHospital.model.score;


import com.DoctorHospital.DoctorHospital.model.Score;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Heart extends Score{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Integer history;
	private Integer ekg;
	private Integer ageH;
	private Integer risk;
	private Integer trop;
	private Integer totalOfHeart;
}
