package com.iae.wis.service.entity;

import java.math.BigDecimal;
import java.sql.Date;

public class WisFeePayment {

	private String fatherID;
	private String firstName;
	private String lastName;
	private BigDecimal totalPaid;
	private BigDecimal totalKidsInIslamicClass;
	private BigDecimal islamicClassFees;
	private BigDecimal totalKidsInQuranClass;
	private BigDecimal quranClassFees;
	private BigDecimal totalFees;
	private BigDecimal totalTuitionPaid;
	private BigDecimal expectedFees;
	private String feeStatus;
	private BigDecimal totalBooksAmountPaid;
	private Date lastPaymentDate;
	private Long lastPaymentDateInLong;

	/**
	 * @return the fatherID
	 */
	public String getFatherID() {
		return fatherID;
	}

	/**
	 * @param fatherID
	 *            the fatherID to set
	 */
	public void setFatherID(String fatherID) {
		this.fatherID = fatherID;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the totalPaid
	 */
	public BigDecimal getTotalPaid() {
		return totalPaid;
	}

	/**
	 * @param totalPaid
	 *            the totalPaid to set
	 */
	public void setTotalPaid(BigDecimal totalPaid) {
		this.totalPaid = totalPaid;
	}

	/**
	 * @return the totalKidsInIslamicClass
	 */
	public BigDecimal getTotalKidsInIslamicClass() {
		return totalKidsInIslamicClass;
	}

	/**
	 * @param totalKidsInIslamicClass
	 *            the totalKidsInIslamicClass to set
	 */
	public void setTotalKidsInIslamicClass(BigDecimal totalKidsInIslamicClass) {
		this.totalKidsInIslamicClass = totalKidsInIslamicClass;
	}

	/**
	 * @return the islamicClassFees
	 */
	public BigDecimal getIslamicClassFees() {
		return islamicClassFees;
	}

	/**
	 * @param islamicClassFees
	 *            the islamicClassFees to set
	 */
	public void setIslamicClassFees(BigDecimal islamicClassFees) {
		this.islamicClassFees = islamicClassFees;
	}

	/**
	 * @return the totalKidsInQuranClass
	 */
	public BigDecimal getTotalKidsInQuranClass() {
		return totalKidsInQuranClass;
	}

	/**
	 * @param totalKidsInQuranClass
	 *            the totalKidsInQuranClass to set
	 */
	public void setTotalKidsInQuranClass(BigDecimal totalKidsInQuranClass) {
		this.totalKidsInQuranClass = totalKidsInQuranClass;
	}

	/**
	 * @return the quranClassFees
	 */
	public BigDecimal getQuranClassFees() {
		return quranClassFees;
	}

	/**
	 * @param quranClassFees
	 *            the quranClassFees to set
	 */
	public void setQuranClassFees(BigDecimal quranClassFees) {
		this.quranClassFees = quranClassFees;
	}

	/**
	 * @return the totalFees
	 */
	public BigDecimal getTotalFees() {
		return totalFees;
	}

	/**
	 * @param totalFees
	 *            the totalFees to set
	 */
	public void setTotalFees(BigDecimal totalFees) {
		this.totalFees = totalFees;
	}

	/**
	 * @return the totalTuitionPaid
	 */
	public BigDecimal getTotalTuitionPaid() {
		return totalTuitionPaid;
	}

	/**
	 * @param totalTuitionPaid
	 *            the totalTuitionPaid to set
	 */
	public void setTotalTuitionPaid(BigDecimal totalTuitionPaid) {
		this.totalTuitionPaid = totalTuitionPaid;
	}

	/**
	 * @return the expectedFees
	 */
	public BigDecimal getExpectedFees() {
		return expectedFees;
	}

	/**
	 * @param expectedFees
	 *            the expectedFees to set
	 */
	public void setExpectedFees(BigDecimal expectedFees) {
		this.expectedFees = expectedFees;
	}

	/**
	 * @return the feeStatus
	 */
	public String getFeeStatus() {
		return feeStatus;
	}

	/**
	 * @param feeStatus
	 *            the feeStatus to set
	 */
	public void setFeeStatus(String feeStatus) {
		this.feeStatus = feeStatus;
	}

	/**
	 * @return the totalBooksAmountPaid
	 */
	public BigDecimal getTotalBooksAmountPaid() {
		return totalBooksAmountPaid;
	}

	/**
	 * @param totalBooksAmountPaid
	 *            the totalBooksAmountPaid to set
	 */
	public void setTotalBooksAmountPaid(BigDecimal totalBooksAmountPaid) {
		this.totalBooksAmountPaid = totalBooksAmountPaid;
	}

	/**
	 * @return the lastPaymentDate
	 */
	public Date getLastPaymentDate() {
		return lastPaymentDate;
	}

	/**
	 * @param lastPaymentDate
	 *            the lastPaymentDate to set
	 */
	public void setLastPaymentDate(Date lastPaymentDate) {
		this.lastPaymentDate = lastPaymentDate;
		setLastPaymentDateInLong(lastPaymentDate == null ? 0 : lastPaymentDate.getTime());
	}

	public Long getLastPaymentDateInLong() {
		return lastPaymentDateInLong;
	}

	public void setLastPaymentDateInLong(Long lastPaymentDateInLong) {
		this.lastPaymentDateInLong = lastPaymentDateInLong;
	}

}
