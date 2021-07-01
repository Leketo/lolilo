package com.leketo.lolilo.entity.core;

import py.com.premedic.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.List;

@Table(name = "COR_COUNTRY")
@Entity(name = "cor_Country")
public class Country extends StandardEntity {

    @NotNull
    @Column(name = "NAME", nullable = false)
    protected String name;

    @NotNull
    @Column(name = "ISO_ALPHA3_CODE", nullable = false, unique = true)
    protected String isoAlpha3Code;

    @NotNull
    @Column(name = "ISO_CODE", nullable = false)
    protected String isoCode;

    @Column(name = "COMMENTS", length = 1024)
    protected String comments;

    @OneToMany(mappedBy = "country")
    protected List<Department> departments;

    public void setIsoAlpha3Code(String isoAlpha3Code) {
        this.isoAlpha3Code = isoAlpha3Code;
    }

    public String getIsoAlpha3Code() {
        return isoAlpha3Code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setIsoCode(String isoCode) {
        this.isoCode = isoCode;
    }

    public String getIsoCode() {
        return isoCode;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getComments() {
        return comments;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }


}
