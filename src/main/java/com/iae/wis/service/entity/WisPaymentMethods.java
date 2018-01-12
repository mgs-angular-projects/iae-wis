// Generated with g9.

package com.iae.wis.service.entity;

import java.util.Set;

public class WisPaymentMethods  {

   

    private int objid;
    private String paymentMethodDescription;
    private Set<WisPayment> wisPayment;

    /** Default constructor. */
    public WisPaymentMethods() {
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
     * Access method for paymentMethodDescription.
     *
     * @return the current value of paymentMethodDescription
     */
    public String getPaymentMethodDescription() {
        return paymentMethodDescription;
    }

    /**
     * Setter method for paymentMethodDescription.
     *
     * @param aPaymentMethodDescription the new value for paymentMethodDescription
     */
    public void setPaymentMethodDescription(String aPaymentMethodDescription) {
        paymentMethodDescription = aPaymentMethodDescription;
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
