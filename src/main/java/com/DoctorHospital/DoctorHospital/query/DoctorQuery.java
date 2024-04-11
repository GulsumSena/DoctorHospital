package com.DoctorHospital.DoctorHospital.query;

public class DoctorQuery {
	public String listBranchDoctor(Long branchID) {
		return "select doctor.name_doctor as nameDoctor, doctor.id as doctorID, branch.id as branchID"
				+ " from doctor, branch"
				+ " where doctor.branch_id=branch.id and branch.id="+branchID;
	}
}
