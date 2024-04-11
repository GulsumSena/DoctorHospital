package com.DoctorHospital.DoctorHospital.service.queryService;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.DoctorHospital.DoctorHospital.dto.response.DoctorQueryDto;
import com.DoctorHospital.DoctorHospital.query.DoctorQuery;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DoctorQueryService {
	private final JdbcTemplate template;
	private final DoctorQuery queries;
	
	public List<DoctorQueryDto> listBranchDoctor(Long branchID){
		String sql=queries.listBranchDoctor(branchID);
		return template.query(sql,
				(rs, rowNum)-> new DoctorQueryDto(
						rs.getString("nameDoctor"),
						rs.getLong("branchID"),
						rs.getLong("doctorID")
						));
	}
	
}
