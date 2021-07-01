package com.leketo.lolilo.entity.core;


import py.com.premedic.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


@PrimaryKeyJoinColumn(name = "ID", referencedColumnName = "ID")
@Table(name = "COR_DOCUMENT_TYPE")
@Entity(name = "cor_DocumentType")
public class DocumentType extends StandardEntity {

    @Column(name = "REQUIRE_NUMBER")
    protected Boolean requireNumber;

    @Column(name = "REQUIRE_ISSUE_DATE")
    protected Boolean requireIssueDate;

    @Column(name = "REQUIRE_EXPIRE_DATE")
    protected Boolean requireExpireDate;

    @Column(name = "VALIDITY_PERIOD_DAYS")
    protected Integer validityPeriodDays;

    @Column(name = "FOR_PRIVATE")
    protected Boolean forPrivate;

    @Column(name = "FOR_BUSINESS")
    protected Boolean forBusiness;

    @Column(name = "IS_DEFAULT_FOR_PRIVATE")
    protected Boolean isDefaultForPrivate;

    @Column(name = "IS_DEFAULT_FOR_BUSINESS")
    protected Boolean isDefaultForBusiness;

    @Column(name = "NUMBER_MASK")
    protected String numberMask;

    @Column(name = "IS_UNIQUE")
    protected Boolean isUnique;

    public Boolean getIsDefaultForBusiness() {
        return isDefaultForBusiness;
    }

    public void setIsDefaultForBusiness(Boolean isDefaultForBusiness) {
        this.isDefaultForBusiness = isDefaultForBusiness;
    }

    public Boolean getIsDefaultForPrivate() {
        return isDefaultForPrivate;
    }

    public void setIsDefaultForPrivate(Boolean isDefaultForPrivate) {
        this.isDefaultForPrivate = isDefaultForPrivate;
    }

    public Boolean getForBusiness() {
        return forBusiness;
    }

    public void setForBusiness(Boolean forBusiness) {
        this.forBusiness = forBusiness;
    }

    public Boolean getForPrivate() {
        return forPrivate;
    }

    public void setForPrivate(Boolean forPrivate) {
        this.forPrivate = forPrivate;
    }


    public Integer getValidityPeriodDays() {
        return validityPeriodDays;
    }

    public void setValidityPeriodDays(Integer validityPeriodDays) {
        this.validityPeriodDays = validityPeriodDays;
    }

    public Boolean getRequireExpireDate() {
        return requireExpireDate;
    }

    public void setRequireExpireDate(Boolean requireExpireDate) {
        this.requireExpireDate = requireExpireDate;
    }

    public Boolean getRequireIssueDate() {
        return requireIssueDate;
    }

    public void setRequireIssueDate(Boolean requireIssueDate) {
        this.requireIssueDate = requireIssueDate;
    }

    public Boolean getRequireNumber() {
        return requireNumber;
    }

    public void setRequireNumber(Boolean requireNumber) {
        this.requireNumber = requireNumber;
    }

    public String getNumberMask() {
        return numberMask;
    }

    public void setNumberMask(String numberMask) {
        this.numberMask = numberMask;
    }

    public Boolean getIsUnique() {
        return isUnique != null && isUnique;
    }

    public void setIsUnique(Boolean unique) {
        isUnique = unique;
    }


}
