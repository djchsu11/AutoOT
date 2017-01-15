package com.schedule.Model;

import javax.persistence.*;

/**
 * Created by David on 1/15/2017.
 */
@Entity
@Table(name = "therapists", schema = "scheduledb", catalog = "")
public class TherapistsEntity {
    private int idtherapists;
    private String firstName;
    private String lastName;

    @Id
    @Column(name = "idtherapists")
    public int getIdtherapists() {
        return idtherapists;
    }

    public void setIdtherapists(int idtherapists) {
        this.idtherapists = idtherapists;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TherapistsEntity that = (TherapistsEntity) o;

        if (idtherapists != that.idtherapists) return false;
        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
        if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idtherapists;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        return result;
    }
}
