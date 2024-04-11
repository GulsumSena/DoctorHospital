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
@NoArgsConstructor
@AllArgsConstructor
public class Mascc extends Score{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Integer symptom;
	private Integer hypotension;
	private Integer koah;
	private Integer tumor;
	private Integer dehydration;
	private Integer feverM;
	private Integer ageM;
	private Integer totalOfMascc;
	
}
