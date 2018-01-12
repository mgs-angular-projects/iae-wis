// Generated with g9.

package com.iae.wis.service.entity;

import java.sql.Date;
import java.util.Set;

public class WisStudents  {

	private int objid;
	private String firstName;
	private String middleName;
	private String lastName;
	private String gender;
	private Date startDate;
	private Date endDate;
	private String schoolName;
	private Date dateOfBirth;
	private Set<WisParentsStudentsRelationship> wisParentsStudentsRelationship;
	private Set<WisStudentClassRegistration> wisStudentClassRegistration;

	/** Default constructor. */
	public WisStudents() {
		super();
	}

	/**
	 * Access method for objid.
	 *
	 * @return the current value of objid
	 */
	public int getObjid() {
		return objid;
	}

	/**
	 * Setter method for objid.
	 *
	 * @param aObjid
	 *            the new value for objid
	 */
	public void setObjid(int aObjid) {
		objid = aObjid;
	}

	/**
	 * Access method for firstName.
	 *
	 * @return the current value of firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Setter method for firstName.
	 *
	 * @param aFirstName
	 *            the new value for firstName
	 */
	public void setFirstName(String aFirstName) {
		firstName = aFirstName;
	}

	/**
	 * Access method for middleName.
	 *
	 * @return the current value of middleName
	 */
	public String getMiddleName() {
		return middleName;
	}

	/**
	 * Setter method for middleName.
	 *
	 * @param aMiddleName
	 *            the new value for middleName
	 */
	public void setMiddleName(String aMiddleName) {
		middleName = aMiddleName;
	}

	/**
	 * Access method for lastName.
	 *
	 * @return the current value of lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Setter method for lastName.
	 *
	 * @param aLastName
	 *            the new value for lastName
	 */
	public void setLastName(String aLastName) {
		lastName = aLastName;
	}

	/**
	 * Access method for gender.
	 *
	 * @return the current value of gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * Setter method for gender.
	 *
	 * @param aGender
	 *            the new value for gender
	 */
	public void setGender(String aGender) {
		gender = aGender;
	}

	/**
	 * Access method for startDate.
	 *
	 * @return the current value of startDate
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * Setter method for startDate.
	 *
	 * @param aStartDate
	 *            the new value for startDate
	 */
	public void setStartDate(Date aStartDate) {
		startDate = aStartDate;
	}

	/**
	 * Access method for endDate.
	 *
	 * @return the current value of endDate
	 */
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * Setter method for endDate.
	 *
	 * @param aEndDate
	 *            the new value for endDate
	 */
	public void setEndDate(Date aEndDate) {
		endDate = aEndDate;
	}

	/**
	 * Access method for schoolName.
	 *
	 * @return the current value of schoolName
	 */
	public String getSchoolName() {
		return schoolName;
	}

	/**
	 * Setter method for schoolName.
	 *
	 * @param aSchoolName
	 *            the new value for schoolName
	 */
	public void setSchoolName(String aSchoolName) {
		schoolName = aSchoolName;
	}

	/**
	 * Access method for dateOfBirth.
	 *
	 * @return the current value of dateOfBirth
	 */
	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	/**
	 * Setter method for dateOfBirth.
	 *
	 * @param aDateOfBirth
	 *            the new value for dateOfBirth
	 */
	public void setDateOfBirth(Date aDateOfBirth) {
		dateOfBirth = aDateOfBirth;
	}

	/**
	 * Access method for wisParentsStudentsRelationship.
	 *
	 * @return the current value of wisParentsStudentsRelationship
	 */
	public Set<WisParentsStudentsRelationship> getWisParentsStudentsRelationship() {
		return wisParentsStudentsRelationship;
	}

	/**
	 * Setter method for wisParentsStudentsRelationship.
	 *
	 * @param aWisParentsStudentsRelationship
	 *            the new value for wisParentsStudentsRelationship
	 */
	public void setWisParentsStudentsRelationship(Set<WisParentsStudentsRelationship> aWisParentsStudentsRelationship) {
		wisParentsStudentsRelationship = aWisParentsStudentsRelationship;
	}

	/**
	 * Access method for wisStudentClassRegistration.
	 *
	 * @return the current value of wisStudentClassRegistration
	 */
	public Set<WisStudentClassRegistration> getWisStudentClassRegistration() {
		return wisStudentClassRegistration;
	}

	/**
	 * Setter method for wisStudentClassRegistration.
	 *
	 * @param aWisStudentClassRegistration
	 *            the new value for wisStudentClassRegistration
	 */
	public void setWisStudentClassRegistration(Set<WisStudentClassRegistration> aWisStudentClassRegistration) {
		wisStudentClassRegistration = aWisStudentClassRegistration;
	}

}
