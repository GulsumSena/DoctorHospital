package com.DoctorHospital.DoctorHospital.service.queryService;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.DoctorHospital.DoctorHospital.dto.response.ScoreQueryDto;
import com.DoctorHospital.DoctorHospital.query.ScoreQuery;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ScoreQueryService {
	private final ScoreQuery query;
	private final JdbcTemplate template;
	
	public List<ScoreQueryDto> listMascc(){
		String sql=query.listMascc();
		return basaltext(sql);
	}
	
	public List<ScoreQueryDto> listHeart(){
		String sql=query.listHeart();
		return basaltext(sql);
	}
	public List<ScoreQueryDto> listTimi(){
		String sql=query.listTimi();
		return basaltext(sql);
	}
	public List<ScoreQueryDto> listGrace(){
		String sql=query.listGrace();
		return basaltext(sql);
	}
	public List<ScoreQueryDto> listAlvarado(){
		String sql=query.listAlvarado();
		return basaltext(sql);
	}
	public List<ScoreQueryDto> listMehran(){
		String sql=query.listMehran();
		return basaltext(sql);
	}
	
	
	public List<ScoreQueryDto> basaltext(String sql) {
		return template.query(sql,
				(rs, rowNum)->new ScoreQueryDto(
						rs.getLong("patientID"),
						rs.getLong("doctorID"),
						rs.getString("nameScore"),
						rs.getString("nameDoctor"),
						rs.getString("namePatient"),
						rs.getInt("agePatient"),
						rs.getString("gender"),
						rs.getInt("total")));
	}
}
