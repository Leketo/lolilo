package com.leketo.lolilo.entity.core;

import py.com.premedic.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Table(name = "COR_PERSON_RELATION", uniqueConstraints = {
        @UniqueConstraint(name = "IDX_COR_PERSON_RELATION_UNQ",
                columnNames = {"PERSON_ID", "RELATED_PERSON_ID"})})
@Entity(name = "cor_PersonRelation")
public class PersonRelation extends StandardEntity {

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PERSON_ID")
    protected Person person;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "RELATED_PERSON_ID")
    protected Person relatedPerson;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "RELATION_TYPE_ID")
    protected PersonRelationType relationType;

    @Future
    @Temporal(TemporalType.DATE)
    @Column(name = "EXPIRATION_DATE")
    protected LocalDate expirationDate;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Person getRelatedPerson() {
        return relatedPerson;
    }

    public void setRelatedPerson(Person relatedPerson) {
        this.relatedPerson = relatedPerson;
    }

    public PersonRelationType getRelationType() {
        return relationType;
    }

    public void setRelationType(PersonRelationType relationType) {
        this.relationType = relationType;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }
}
