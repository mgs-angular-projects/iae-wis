// Generated with g9.

package com.iae.wis.service.entity;

import java.util.Set;

public class WisParents  {

    
    private int objid;
    private String firstName;
    private String middleName;
    private String lastName;
    private String cellNumber;
    private String homePhoneNumber;
    private String emailAddress;
    private WisAddresses wisAddresses;
    private Set<WisParentsStudentsRelationship> wisParentsStudentsRelationship;
    private Set<WisPayment> wisPayment;

    /** Default constructor. */
    public WisParents() {
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
     * @param aFirstName the new value for firstName
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
     * @param aMiddleName the new value for middleName
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
     * @param aLastName the new value for lastName
     */
    public void setLastName(String aLastName) {
        lastName = aLastName;
    }

    /**
     * Access method for cellNumber.
     *
     * @return the current value of cellNumber
     */
    public String getCellNumber() {
        return cellNumber;
    }

    /**
     * Setter method for cellNumber.
     *
     * @param aCellNumber the new value for cellNumber
     */
    public void setCellNumber(String aCellNumber) {
        cellNumber = aCellNumber;
    }

    /**
     * Access method for homePhoneNumber.
     *
     * @return the current value of homePhoneNumber
     */
    public String getHomePhoneNumber() {
        return homePhoneNumber;
    }

    /**
     * Setter method for homePhoneNumber.
     *
     * @param aHomePhoneNumber the new value for homePhoneNumber
     */
    public void setHomePhoneNumber(String aHomePhoneNumber) {
        homePhoneNumber = aHomePhoneNumber;
    }

    /**
     * Access method for emailAddress.
     *
     * @return the current value of emailAddress
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Setter method for emailAddress.
     *
     * @param aEmailAddress the new value for emailAddress
     */
    public void setEmailAddress(String aEmailAddress) {
        emailAddress = aEmailAddress;
    }

    /**
     * Access method for wisAddresses.
     *
     * @return the current value of wisAddresses
     */
    public WisAddresses getWisAddresses() {
        return wisAddresses;
    }

    /**
     * Setter method for wisAddresses.
     *
     * @param aWisAddresses the new value for wisAddresses
     */
    public void setWisAddresses(WisAddresses aWisAddresses) {
        wisAddresses = aWisAddresses;
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
     * @param aWisParentsStudentsRelationship the new value for wisParentsStudentsRelationship
     */
    public void setWisParentsStudentsRelationship(Set<WisParentsStudentsRelationship> aWisParentsStudentsRelationship) {
        wisParentsStudentsRelationship = aWisParentsStudentsRelationship;
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
