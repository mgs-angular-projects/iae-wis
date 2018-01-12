// Generated with g9.

package com.iae.wis.service.entity;

import java.sql.Date;

public class WisStudentClassRegistration  {

   
    private Date registrationDate;
    private Date classStartDate;
    private Date classEndDate;
    private WisClasses wisClasses;
    private WisStudents wisStudents;

    /** Default constructor. */
    public WisStudentClassRegistration() {
        super();
    }

    /**
     * Access method for registrationDate.
     *
     * @return the current value of registrationDate
     */
    public Date getRegistrationDate() {
        return registrationDate;
    }

    /**
     * Setter method for registrationDate.
     *
     * @param aRegistrationDate the new value for registrationDate
     */
    public void setRegistrationDate(Date aRegistrationDate) {
        registrationDate = aRegistrationDate;
    }

    /**
     * Access method for classStartDate.
     *
     * @return the current value of classStartDate
     */
    public Date getClassStartDate() {
        return classStartDate;
    }

    /**
     * Setter method for classStartDate.
     *
     * @param aClassStartDate the new value for classStartDate
     */
    public void setClassStartDate(Date aClassStartDate) {
        classStartDate = aClassStartDate;
    }

    /**
     * Access method for classEndDate.
     *
     * @return the current value of classEndDate
     */
    public Date getClassEndDate() {
        return classEndDate;
    }

    /**
     * Setter method for classEndDate.
     *
     * @param aClassEndDate the new value for classEndDate
     */
    public void setClassEndDate(Date aClassEndDate) {
        classEndDate = aClassEndDate;
    }

    /**
     * Access method for wisClasses.
     *
     * @return the current value of wisClasses
     */
    public WisClasses getWisClasses() {
        return wisClasses;
    }

    /**
     * Setter method for wisClasses.
     *
     * @param aWisClasses the new value for wisClasses
     */
    public void setWisClasses(WisClasses aWisClasses) {
        wisClasses = aWisClasses;
    }

    /**
     * Access method for wisStudents.
     *
     * @return the current value of wisStudents
     */
    public WisStudents getWisStudents() {
        return wisStudents;
    }

    /**
     * Setter method for wisStudents.
     *
     * @param aWisStudents the new value for wisStudents
     */
    public void setWisStudents(WisStudents aWisStudents) {
        wisStudents = aWisStudents;
    }


}
