/**
 * 
 */
package com.iae.wis.service.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.iae.wis.service.vo.Student;

/**
 * @author
 *
 */
@Repository
public class StudentJdbcRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public Student findById(long id) {

		return jdbcTemplate.queryForObject("select * from iae_wis.wis_students where objid=?", new Object[] { id },
				new BeanPropertyRowMapper<Student>(Student.class));
	}
}


