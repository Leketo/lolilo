package com.leketo.lolilo.entity.core;


import com.leketo.lolilo.sys.LocalizedString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

@Table(name = "COR_PERSON_RELATION_TYPE")
@Entity(name = "cor_PersonRelationType")
public class PersonRelationType {

    @NotNull
    @Column(name = "NAME", nullable = false)
    protected String name;

    @NotNull
    @Column(name = "APPLICABLE_TO_PHYSICAL_PERSON", nullable = false)
    protected Boolean applicableToPhysicalPerson = false;

    @NotNull
    @Column(name = "APPLICABLE_TO_JURIDICAL_PERSON", nullable = false)
    protected Boolean applicableToJuridicalPerson = false;

    @NotNull
    @Column(name = "REQUIRES_EXPIRATION_DATE", nullable = false)
    protected Boolean requiresExpirationDate = false;

    @Transient
    protected LocalizedString localizedName;

    public void setName(LocalizedString localizedName) {
        this.name = localizedName != null ? localizedName.toJson() : null;
        this.localizedName = localizedName;
    }

    public LocalizedString getName() {
        if (localizedName == null) {
            localizedName = new LocalizedString(name);
        }

        return localizedName;
    }

    public Boolean getApplicableToPhysicalPerson() {
        return applicableToPhysicalPerson;
    }

    public void setApplicableToPhysicalPerson(Boolean applicableToPhysicalPerson) {
        this.applicableToPhysicalPerson = applicableToPhysicalPerson;
    }

    public Boolean getApplicableToJuridicalPerson() {
        return applicableToJuridicalPerson;
    }

    public void setApplicableToJuridicalPerson(Boolean applicableToJuridicalPerson) {
        this.applicableToJuridicalPerson = applicableToJuridicalPerson;
    }

    public Boolean getRequiresExpirationDate() {
        return requiresExpirationDate;
    }

    public void setRequiresExpirationDate(Boolean requiresExpirationDate) {
        this.requiresExpirationDate = requiresExpirationDate;
    }

    public String getLocalizedName() {
        return getName().getLocalizedValue();
    }
}