// Generated with g9.

package com.iae.wis.service.entity;

import java.util.Set;

public class WisPaymentType  {

    private int objid;
    private String paymentType;
    private Set<WisPayment> wisPayment;

    /** Default constructor. */
    public WisPaymentType() {
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
     * Access method for paymentType.
     *
     * @return the current value of paymentType
     */
    public String getPaymentType() {
        return paymentType;
    }

    /**
     * Setter method for paymentType.
     *
     * @param aPaymentType the new value for paymentType
     */
    public void setPaymentType(String aPaymentType) {
        paymentType = aPaymentType;
    }

    /**
     * Access method for wisPayment.
     *
     * @return the current value of wisPayment
     */
    public Set<WisPayment> getWisPayment() {
        return wisPayment;
    }

    /**
     * Setter method for wisPayment.
     *
     * @param aWisPayment the new value for wisPayment
     */
    public void setWisPayment(Set<WisPayment> aWisPayment) {
        wisPayment = aWisPayment;
    }

    

}
