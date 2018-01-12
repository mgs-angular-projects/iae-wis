package com.iae.wis.service.vo;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

class StudentRowMapper implements RowMapper<Student> {
	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student student = new Student();
		student.setFirstName(rs.getString("first_name"));
		student.setLastName(rs.getString("last_name"));
		return student;
	}
}