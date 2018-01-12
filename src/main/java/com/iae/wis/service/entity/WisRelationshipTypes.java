// Generated with g9.

package com.iae.wis.service.entity;

import java.util.Set;

public class WisRelationshipTypes {

   

    private int objid;
    private String relationshipTypeDescription;
    private Set<WisParentsStudentsRelationship> wisParentsStudentsRelationship;

    /** Default constructor. */
    public WisRelationshipTypes() {
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
     * Access method for relationshipTypeDescription.
     *
     * @return the current value of relationshipTypeDescription
     */
    public String getRelationshipTypeDescription() {
        return relationshipTypeDescription;
    }

    /**
     * Setter method for relationshipTypeDescription.
     *
     * @param aRelationshipTypeDescription the new value for relationshipTypeDescription
     */
    public void setRelationshipTypeDescription(String aRelationshipTypeDescription) {
        relationshipTypeDescription = aRelationshipTypeDescription;
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

   
}
