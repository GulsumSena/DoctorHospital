package com.DoctorHospital.DoctorHospital.model.score;


import com.DoctorHospital.DoctorHospital.model.Score;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Mehran extends Score{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Integer hypotensionMehran;
	private Integer intraAortik;
	private Integer KKY;
	private Integer diabet;
	private Integer ageMehran;
	private Integer anemia;
	private Integer kreatininMehran;
	private Integer gfr;
	private Integer amountOfContast;
	private Integer totalOfMehran;
}
