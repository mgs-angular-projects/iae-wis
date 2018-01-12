/**
 * 
 */
package com.iae.wis.service.dao;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.iae.wis.service.entity.WisFeePayment;
import com.iae.wis.service.entity.WisStudent;

/**
 * @author
 *
 */
@Repository
public class WisJdbcRepository {

	private List<WisStudent> wisStudentList;

	@Value("${query.students.list}")
	private String studentsQuery;

	@Value("${query.payments.list}")
	private String paymentsQuery;

	@Value("${wis.test.mode}")
	private boolean testMode;

	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<WisStudent> getStudents() {

		if (testMode) {
			wisStudentList = new ArrayList<>();
			for (int i = 0; i < 21; i++) {
				wisStudentList.add(getStudent(i + ""));
			}
			return wisStudentList;
		} else {
			return jdbcTemplate.query(studentsQuery, new BeanPropertyRowMapper<WisStudent>(WisStudent.class));
		}
	}

	public List<WisFeePayment> getFeePayments() {

		if (testMode) {
			List<WisFeePayment> feePayments = new ArrayList<>();
			for (int i = 0; i < 21; i++) {
				feePayments.add(getFeePayment(i + ""));
			}
			return feePayments;
		} else {
			return jdbcTemplate.query(paymentsQuery, new BeanPropertyRowMapper<WisFeePayment>(WisFeePayment.class));
		}
	}

	private WisFeePayment getFeePayment(String index) {
		WisFeePayment fpay = new WisFeePayment();

		fpay.setExpectedFees(BigDecimal.valueOf(1808).add(new BigDecimal(index)));
		fpay.setFatherID("100" + index);
		fpay.setFeeStatus("OnTime");
		fpay.setFirstName("StudentFName1");
		fpay.setIslamicClassFees(BigDecimal.valueOf(1223).add(new BigDecimal(index)));
		fpay.setLastName("LastNameStudent");
		fpay.setLastPaymentDate(new Date(System.currentTimeMillis()));
		fpay.setQuranClassFees(BigDecimal.valueOf(123245).add(new BigDecimal(index)));
		fpay.setTotalBooksAmountPaid(BigDecimal.valueOf(1232323).add(new BigDecimal(index)));
		fpay.setTotalFees(BigDecimal.valueOf(500).add(new BigDecimal(index)));
		fpay.setTotalKidsInIslamicClass(BigDecimal.valueOf(10).add(new BigDecimal(index)));
		fpay.setTotalKidsInQuranClass(BigDecimal.valueOf(20).add(new BigDecimal(index)));
		fpay.setTotalPaid(BigDecimal.valueOf(8700).add(new BigDecimal(index)));
		fpay.setTotalTuitionPaid(BigDecimal.valueOf(9000).add(new BigDecimal(index)));

		return fpay;
	}

	private WisStudent getStudent(String index) {
		WisStudent student = new WisStudent();
		student.setStudentFirstName("StudentFN" + index);
		student.setStudentMiddleName("StudentMN" + index);
		student.setStudentLastName("StudentLN" + index);
		student.setGender("M");
		student.setDateOfBirth(new Date(System.currentTimeMillis()));
		student.setEmail(index + "vma@gmail.com");
		student.setFatherFirstName("FatherFristName" + index);
		student.setFatherMiddleName("FatherMiddleName" + index);
		student.setFatherLastName("FatherLastName" + index);
		student.setfID("1000" + index);
		student.setHomePhoneNumber("1234443344" + index);
		student.setiClassLevel("iClass" + index);
		student.setqClassLevel("qClass" + index);
		student.setmID("mid" + index);
		student.setMotherFirstName("MotherristName" + index);
		student.setMotherMiddleName("MotherrMiddleName" + index);
		student.setMotherLastName("MotherLastName" + index);
		student.setCellNumber("1232323232");
		student.setObjid(1000 + Integer.valueOf(index));

		return student;
	}
}
