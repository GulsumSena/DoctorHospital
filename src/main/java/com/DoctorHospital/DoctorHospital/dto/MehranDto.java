package com.DoctorHospital.DoctorHospital.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MehranDto {
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
	
	public Integer calculate() {
		return hypotensionMehran+intraAortik+KKY+diabet+ageMehran+anemia+kreatininMehran+gfr+amountOfContast;
	}
}
