// Generated with g9.

package com.iae.wis.service.entity;

import java.util.Set;

public class WisClasses  {


    private int objid;
    private String classLevel;
    private int wisClasses2WisClassType;
    private String classDescription;
    private Set<WisStudentClassRegistration> wisStudentClassRegistration;

    /** Default constructor. */
    public WisClasses() {
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
     * Access method for classLevel.
     *
     * @return the current value of classLevel
     */
    public String getClassLevel() {
        return classLevel;
    }

    /**
     * Setter method for classLevel.
     *
     * @param aClassLevel the new value for classLevel
     */
    public void setClassLevel(String aClassLevel) {
        classLevel = aClassLevel;
    }

    /**
     * Access method for wisClasses2WisClassType.
     *
     * @return the current value of wisClasses2WisClassType
     */
    public int getWisClasses2WisClassType() {
        return wisClasses2WisClassType;
    }

    /**
     * Setter method for wisClasses2WisClassType.
     *
     * @param aWisClasses2WisClassType the new value for wisClasses2WisClassType
     */
    public void setWisClasses2WisClassType(int aWisClasses2WisClassType) {
        wisClasses2WisClassType = aWisClasses2WisClassType;
    }

    /**
     * Access method for classDescription.
     *
     * @return the current value of classDescription
     */
    public String getClassDescription() {
        return classDescription;
    }

    /**
     * Setter method for classDescription.
     *
     * @param aClassDescription the new value for classDescription
     */
    public void setClassDescription(String aClassDescription) {
        classDescription = aClassDescription;
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
     * @param aWisStudentClassRegistration the new value for wisStudentClassRegistration
     */
    public void setWisStudentClassRegistration(Set<WisStudentClassRegistration> aWisStudentClassRegistration) {
        wisStudentClassRegistration = aWisStudentClassRegistration;
    }


}
