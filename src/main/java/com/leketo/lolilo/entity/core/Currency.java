package com.leketo.lolilo.entity.core;

import py.com.premedic.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "COR_CURRENCY")
@Entity(name = "cor_Currency")
public class Currency extends StandardEntity {

    private static final long serialVersionUID = 2129014552323992276L;

    @NotNull
    @Column(name = "NAME", nullable = false)
    protected String name;

    @NotNull
    @Column(name = "CODE", nullable = false, unique = true)
    protected String code;

    @NotNull
    @Column(name = "CODE_ISO", nullable = false, unique = true)
    protected String codeIso;

    @NotNull
    @Column(name = "SYMBOL", nullable = false, unique = true)
    protected String symbol;

    @NotNull
    @Column(name = "FORMAT", nullable = false, length = 20)
    protected String format;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "COUNTRY_ID")
    protected Country country;

    @NotNull
    @Column(name = "DECIMALS", nullable = false)
    protected Integer decimals;

    @Column(name = "ENABLED")
    protected Boolean enabled = true;

    public void setFormat(String format) {
        this.format = format;
    }

    public String getFormat() {
        return format;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
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

    public void setCodeIso(String codeIso) {
        this.codeIso = codeIso;
    }

    public String getCodeIso() {
        return codeIso;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setDecimals(Integer decimals) {
        this.decimals = decimals;
    }

    public Integer getDecimals() {
        return decimals;
    }

    public String getCaption() {
        return name;
    }

}
