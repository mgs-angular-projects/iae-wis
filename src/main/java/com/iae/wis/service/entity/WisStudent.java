package com.iae.wis.service.entity;

import java.sql.Date;

public class WisStudent {

	private int objid;
	private String studentFirstName;
	private String studentMiddleName;
	private String studentLastName;
	private String gender;
	private String iClassLevel;
	private String qClassLevel;
	private Date dateOfBirth;
	private Long dobInLong;
	private String fID;
	private String fatherFirstName;
	private String fatherMiddleName;
	private String fatherLastName;
	private String mID;
	private String motherFirstName;
	private String motherMiddleName;
	private String motherLastName;
	private String cellNumber;
	private String homePhoneNumber;
	private String email;

	/**
	 * @return the objid
	 */
	public int getObjid() {
		return objid;
	}

	/**
	 * @param objid
	 *            the objid to set
	 */
	public void setObjid(int objid) {
		this.objid = objid;
	}

	/**
	 * @return the studentFirstName
	 */
	public String getStudentFirstName() {
		return studentFirstName;
	}

	/**
	 * @param studentFirstName
	 *            the studentFirstName to set
	 */
	public void setStudentFirstName(String studentFirstName) {
		this.studentFirstName = studentFirstName;
	}

	/**
	 * @return the studentMiddleName
	 */
	public String getStudentMiddleName() {
		return studentMiddleName;
	}

	/**
	 * @param studentMiddleName
	 *            the studentMiddleName to set
	 */
	public void setStudentMiddleName(String studentMiddleName) {
		this.studentMiddleName = studentMiddleName;
	}

	/**
	 * @return the studentLastName
	 */
	public String getStudentLastName() {
		return studentLastName;
	}

	/**
	 * @param studentLastName
	 *            the studentLastName to set
	 */
	public void setStudentLastName(String studentLastName) {
		this.studentLastName = studentLastName;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender
	 *            the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the iClassLevel
	 */
	public String getiClassLevel() {
		return iClassLevel;
	}

	/**
	 * @param iClassLevel
	 *            the iClassLevel to set
	 */
	public void setiClassLevel(String iClassLevel) {
		this.iClassLevel = iClassLevel;
	}

	/**
	 * @return the qClassLevel
	 */
	public String getqClassLevel() {
		return qClassLevel;
	}

	/**
	 * @param qClassLevel
	 *            the qClassLevel to set
	 */
	public void setqClassLevel(String qClassLevel) {
		this.qClassLevel = qClassLevel;
	}

	/**
	 * @return the dateOfBirth
	 */
	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	/**
	 * @param dateOfBirth
	 *            the dateOfBirth to set
	 */
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
		setDobInLong(dateOfBirth == null ? 0 : dateOfBirth.getTime());
	}

	/**
	 * @return the fID
	 */
	public String getfID() {
		return fID;
	}

	/**
	 * @param fID
	 *            the fID to set
	 */
	public void setfID(String fID) {
		this.fID = fID;
	}

	/**
	 * @return the fatherFirstName
	 */
	public String getFatherFirstName() {
		return fatherFirstName;
	}

	/**
	 * @param fatherFirstName
	 *            the fatherFirstName to set
	 */
	public void setFatherFirstName(String fatherFirstName) {
		this.fatherFirstName = fatherFirstName;
	}

	/**
	 * @return the fatherMiddleName
	 */
	public String getFatherMiddleName() {
		return fatherMiddleName;
	}

	/**
	 * @param fatherMiddleName
	 *            the fatherMiddleName to set
	 */
	public void setFatherMiddleName(String fatherMiddleName) {
		this.fatherMiddleName = fatherMiddleName;
	}

	/**
	 * @return the fatherLastName
	 */
	public String getFatherLastName() {
		return fatherLastName;
	}

	/**
	 * @param fatherLastName
	 *            the fatherLastName to set
	 */
	public void setFatherLastName(String fatherLastName) {
		this.fatherLastName = fatherLastName;
	}

	/**
	 * @return the mID
	 */
	public String getmID() {
		return mID;
	}

	/**
	 * @param mID
	 *            the mID to set
	 */
	public void setmID(String mID) {
		this.mID = mID;
	}

	/**
	 * @return the motherFirstName
	 */
	public String getMotherFirstName() {
		return motherFirstName;
	}

	/**
	 * @param motherFirstName
	 *            the motherFirstName to set
	 */
	public void setMotherFirstName(String motherFirstName) {
		this.motherFirstName = motherFirstName;
	}

	/**
	 * @return the motherMiddleName
	 */
	public String getMotherMiddleName() {
		return motherMiddleName;
	}

	/**
	 * @param motherMiddleName
	 *            the motherMiddleName to set
	 */
	public void setMotherMiddleName(String motherMiddleName) {
		this.motherMiddleName = motherMiddleName;
	}

	/**
	 * @return the motherLastName
	 */
	public String getMotherLastName() {
		return motherLastName;
	}

	/**
	 * @param motherLastName
	 *            the motherLastName to set
	 */
	public void setMotherLastName(String motherLastName) {
		this.motherLastName = motherLastName;
	}

	/**
	 * @return the cellNumber
	 */
	public String getCellNumber() {
		return cellNumber;
	}

	/**
	 * @param cellNumber
	 *            the cellNumber to set
	 */
	public void setCellNumber(String cellNumber) {
		this.cellNumber = cellNumber;
	}

	/**
	 * @return the homePhoneNumber
	 */
	public String getHomePhoneNumber() {
		return homePhoneNumber;
	}

	/**
	 * @param homePhoneNumber
	 *            the homePhoneNumber to set
	 */
	public void setHomePhoneNumber(String homePhoneNumber) {
		this.homePhoneNumber = homePhoneNumber;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	public Long getDobInLong() {
		return dobInLong;
	}

	public void setDobInLong(Long dobInLong) {
		this.dobInLong = dobInLong;
	}

}
