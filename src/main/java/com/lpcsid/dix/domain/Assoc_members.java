package com.lpcsid.dix.domain;


import javax.persistence.*;
import javax.validation.constraints.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

/**
 * A Assoc_members.
 */
@Entity
@Table(name = "assoc_members")
public class Assoc_members implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "joined_date")
    private LocalDate joined_date;

    @ManyToOne
    private UserProfile userProfile;

    @ManyToOne
    private Association association;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getJoined_date() {
        return joined_date;
    }

    public Assoc_members joined_date(LocalDate joined_date) {
        this.joined_date = joined_date;
        return this;
    }

    public void setJoined_date(LocalDate joined_date) {
        this.joined_date = joined_date;
    }

    public UserProfile getUserProfile() {
        return userProfile;
    }

    public Assoc_members userProfile(UserProfile userProfile) {
        this.userProfile = userProfile;
        return this;
    }

    public void setUserProfile(UserProfile userProfile) {
        this.userProfile = userProfile;
    }

    public Association getAssociation() {
        return association;
    }

    public Assoc_members association(Association association) {
        this.association = association;
        return this;
    }

    public void setAssociation(Association association) {
        this.association = association;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Assoc_members assoc_members = (Assoc_members) o;
        if (assoc_members.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), assoc_members.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Assoc_members{" +
            "id=" + getId() +
            ", joined_date='" + getJoined_date() + "'" +
            "}";
    }
}
