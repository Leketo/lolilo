package com.leketo.lolilo.entity.core;

import javax.annotation.PostConstruct;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@PrimaryKeyJoinColumn(name = "ID", referencedColumnName = "ID")
@Table(name = "COR_JURIDICAL_PERSON")
@Entity(name = "cor_JuridicalPerson")
public class JuridicalPerson extends Person {

    @NotNull
    @Column(name = "LEGAL_NAME", nullable = false)
    protected String legalName;

    @NotNull
    @Column(name = "BRAND_NAME", nullable = false)
    protected String brandName;

    @NotNull
    @Column(name = "JURIDICAL_TYPE")
    protected JuridicalType juridicalType;

    @Temporal(TemporalType.DATE)
    @Column(name = "OPENING_DATE")
    protected LocalDate openingDate;

    @Column(name = "RETENTION_AGENT")
    protected Boolean retentionAgent;

    @Temporal(TemporalType.DATE)
    @Column(name = "SOCIETY_EXPIRATION_DATE")
    protected LocalDate societyExpirationDate;

    public Boolean getRetentionAgent() {
        return retentionAgent;
    }

    public void setRetentionAgent(Boolean retentionAgent) {
        this.retentionAgent = retentionAgent;
    }

    public void setLegalName(String legalName) {
        this.legalName = legalName;
    }

    public String getLegalName() {
        return legalName;
    }

    public JuridicalType getJuridicalType() {
        return juridicalType;
    }

    public void setJuridicalType(JuridicalType juridicalType) {
        this.juridicalType = juridicalType;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setOpeningDate(LocalDate openingDate) {
        this.openingDate = openingDate;
    }

    public LocalDate getOpeningDate() {
        return openingDate;
    }

    public void setSocietyExpirationDate(LocalDate societyExpirationDate) {
        this.societyExpirationDate = societyExpirationDate;
    }

    public LocalDate getSocietyExpirationDate() {
        return societyExpirationDate;
    }

    @Override
    public String getPersonFullName() {
        return brandName;
    }

    @PostConstruct
    private void postConstruct() {
        setType(PersonType.JURIDICAL);
    }

}
