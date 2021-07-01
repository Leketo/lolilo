package com.leketo.lolilo.entity.core;

import py.com.premedic.entity.StandardEntity;

import javax.persistence.*;
import java.util.List;

@DiscriminatorColumn(discriminatorType = DiscriminatorType.STRING)
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "COR_PERSON")
@Entity(name = "cor_Person")
public class Person extends StandardEntity {

    @Column(name = "CODE")
    protected String code;

    @Column(name = "FULL_NAME", nullable = false)
    protected String fullName;

    @Column(name = "EMAIL")
    protected String email;

    @Column(name = "PERSON_TYPE", nullable = false)
    protected String type;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "NATIONALITY_ID")
    protected Country nationality;
/*
    @OneToMany(mappedBy = "person")
    protected List<PersonAddress> addresses;
*/

 /*   @OneToMany(mappedBy = "person")
    protected List<PersonPhone> phones;
*/
    /*@OneToOne(fetch = FetchType.LAZY, mappedBy = "person")
    protected Client client;
*/

    @OneToMany(mappedBy = "person")
    protected List<Document> documents;

    @OneToMany(mappedBy = "person")
    protected List<PersonRelation> relatedPersons;

    @OneToMany(mappedBy = "relatedPerson")
    protected List<PersonRelation> relatedFrom;

    /*public List<PersonPhone> getPhones() {
        return phones;
    }

    public void setPhones(List<PersonPhone> phones) {
        this.phones = phones;
    }*/

    public List<Document> getDocuments() {
        return documents;
    }

    public void setDocuments(List<Document> documents) {
        this.documents = documents;
    }

   /* public void setAddresses(List<PersonAddress> addresses) {
        this.addresses = addresses;
    }*/

   /* public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }*/

   /* public List<PersonAddress> getAddresses() {
        return addresses;
    }*/


    public Country getNationality() {
        return nationality;
    }

    public void setNationality(Country nationality) {
        this.nationality = nationality;
    }



    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }


    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setType(PersonType type) {
        this.type = type == null ? null : type.getId();
    }

    public PersonType getType() {
        return type == null ? null : PersonType.fromId(type);
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public List<PersonRelation> getRelatedPersons() {
        return relatedPersons;
    }

    public void setRelatedPersons(List<PersonRelation> relatedPersons) {
        this.relatedPersons = relatedPersons;
    }

    public List<PersonRelation> getRelatedFrom() {
        return relatedFrom;
    }

    public void setRelatedFrom(List<PersonRelation> relatedFrom) {
        this.relatedFrom = relatedFrom;
    }


    public String getPersonFullName() {
        return fullName;
    }


}
