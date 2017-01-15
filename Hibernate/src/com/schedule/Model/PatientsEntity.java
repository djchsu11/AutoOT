package com.schedule.Model;

import javax.persistence.*;

/**
 * Created by David on 1/15/2017.
 */
@Entity
@Table(name = "patients", schema = "scheduledb", catalog = "")
public class PatientsEntity {
    private int idpatients;
    private String firstName;
    private String lastName;
    private String roomNumber;
    private Integer priority;

    @Id
    @Column(name = "idpatients")
    public int getIdpatients() {
        return idpatients;
    }

    public void setIdpatients(int idpatients) {
        this.idpatients = idpatients;
    }

    @Basic
    @Column(name = "first_name")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "last_name")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "room_number")
    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Basic
    @Column(name = "priority")
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PatientsEntity that = (PatientsEntity) o;

        if (idpatients != that.idpatients) return false;
        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
        if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null) return false;
        if (roomNumber != null ? !roomNumber.equals(that.roomNumber) : that.roomNumber != null) return false;
        if (priority != null ? !priority.equals(that.priority) : that.priority != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idpatients;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (roomNumber != null ? roomNumber.hashCode() : 0);
        result = 31 * result + (priority != null ? priority.hashCode() : 0);
        return result;
    }
}
