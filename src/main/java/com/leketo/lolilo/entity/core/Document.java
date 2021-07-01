package com.leketo.lolilo.entity.core;

import py.com.premedic.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Table(name = "COR_DOCUMENT", indexes = {
        @Index(name = "IDX_COR_DOCUMENT_UNQ", columnList = "DOCUMENT_NUMBER, DOCUMENT_TYPE_ID", unique = true)
})
@Entity(name = "cor_Document")
public class Document extends StandardEntity {

    @Column(name = "DOCUMENT_NUMBER")
    protected String documentNumber;

    @Temporal(TemporalType.DATE)
    @Column(name = "ISSUE_DATE")
    protected LocalDate issueDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "EXPIRATION_DATE")
    protected LocalDate expirationDate;

    @Column(name = "IS_VALIDATED")
    protected Boolean isValidated;

    @Lob
    @Column(name = "COMMENTS")
    protected String comments;

    @Column(name = "SOURCE")
    protected String source;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "DOCUMENT_TYPE_ID")
    protected DocumentType documentType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COUNTRY_ID")
    protected Country country;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PERSON_ID")
    protected Person person;

    @Column(name = "IS_TAX_DOCUMENT")
    protected Boolean isTaxDocument = false;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Boolean getIsValidated() {
        return isValidated;
    }

    public void setIsValidated(Boolean isValidated) {
        this.isValidated = isValidated;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public DocumentType getDocumentType() {
        return documentType;
    }

    public void setDocumentType(DocumentType documentType) {
        this.documentType = documentType;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }


    public Boolean getIsTaxDocument() {
        return isTaxDocument;
    }

    public void setIsTaxDocument(Boolean isTaxDocument) {
        this.isTaxDocument = isTaxDocument;
    }

}
