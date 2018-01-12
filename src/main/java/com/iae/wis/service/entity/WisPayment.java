// Generated with g9.

package com.iae.wis.service.entity;

import java.sql.Date;

public class WisPayment {

    

    private int objid;
    private Date paymentDate;
    private double amount;
    private String comments;
    private WisParents wisParents;
    private WisPaymentMethods wisPaymentMethods;
    private WisPaymentType wisPaymentType;

    /** Default constructor. */
    public WisPayment() {
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
     * @param aObjid the new value for objid
     */
    public void setObjid(int aObjid) {
        objid = aObjid;
    }

    /**
     * Access method for paymentDate.
     *
     * @return the current value of paymentDate
     */
    public Date getPaymentDate() {
        return paymentDate;
    }

    /**
     * Setter method for paymentDate.
     *
     * @param aPaymentDate the new value for paymentDate
     */
    public void setPaymentDate(Date aPaymentDate) {
        paymentDate = aPaymentDate;
    }

    /**
     * Access method for amount.
     *
     * @return the current value of amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Setter method for amount.
     *
     * @param aAmount the new value for amount
     */
    public void setAmount(double aAmount) {
        amount = aAmount;
    }

    /**
     * Access method for comments.
     *
     * @return the current value of comments
     */
    public String getComments() {
        return comments;
    }

    /**
     * Setter method for comments.
     *
     * @param aComments the new value for comments
     */
    public void setComments(String aComments) {
        comments = aComments;
    }

    /**
     * Access method for wisParents.
     *
     * @return the current value of wisParents
     */
    public WisParents getWisParents() {
        return wisParents;
    }

    /**
     * Setter method for wisParents.
     *
     * @param aWisParents the new value for wisParents
     */
    public void setWisParents(WisParents aWisParents) {
        wisParents = aWisParents;
    }

    /**
     * Access method for wisPaymentMethods.
     *
     * @return the current value of wisPaymentMethods
     */
    public WisPaymentMethods getWisPaymentMethods() {
        return wisPaymentMethods;
    }

    /**
     * Setter method for wisPaymentMethods.
     *
     * @param aWisPaymentMethods the new value for wisPaymentMethods
     */
    public void setWisPaymentMethods(WisPaymentMethods aWisPaymentMethods) {
        wisPaymentMethods = aWisPaymentMethods;
    }

    /**
     * Access method for wisPaymentType.
     *
     * @return the current value of wisPaymentType
     */
    public WisPaymentType getWisPaymentType() {
        return wisPaymentType;
    }

    /**
     * Setter method for wisPaymentType.
     *
     * @param aWisPaymentType the new value for wisPaymentType
     */
    public void setWisPaymentType(WisPaymentType aWisPaymentType) {
        wisPaymentType = aWisPaymentType;
    }

   

}
