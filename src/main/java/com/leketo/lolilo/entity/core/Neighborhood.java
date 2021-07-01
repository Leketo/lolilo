package com.leketo.lolilo.entity.core;

import py.com.premedic.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "cor_NEIGHBORHOOD")
@Entity(name = "cor_Neighborhood")
public class Neighborhood extends StandardEntity {

    @NotNull
    @Column(name = "NAME", nullable = false)
    protected String name;

    @NotNull
    @Column(name = "CODE", nullable = false)
    protected String code;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CITY_ID")
    protected City city;

    @Column(name = "COMMENTS", length = 1024)
    protected String comments;

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getComments() {
        return comments;
    }


    public void setCity(City city) {
        this.city = city;
    }

    public City getCity() {
        return city;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

}
