package com.leketo.lolilo.entity.core;

import org.apache.commons.lang3.StringUtils;

import javax.annotation.PostConstruct;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@PrimaryKeyJoinColumn(name = "ID", referencedColumnName = "ID")
@Table(name = "COR_PHYSICAL_PERSON")
@Entity(name = "cor_PhysicalPerson")
public class PhysicalPerson extends Person {

    @NotNull
    @Column(name = "FIRST_NAME", nullable = false, length = 30)
    protected String firstName;

    @Column(name = "SECOND_NAME", length = 30)
    protected String secondName;

    @NotNull
    @Column(name = "FIRST_LAST_NAME", nullable = false, length = 40)
    protected String firstLastName;

    @Column(name = "SECOND_LAST_NAME", length = 30)
    protected String secondLastName;

    @Column(name = "GENDER")
    protected Gender gender;

    @Column(name = "MARITAL_STATUS")
    protected MaritalStatus maritalStatus;

    @Column(name = "BIRTH_DATE", nullable = false)
    protected LocalDate birthDate;

    public MaritalStatus getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(MaritalStatus maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstLastName(String firstLastName) {
        this.firstLastName = firstLastName;
    }

    public String getFirstLastName() {
        return firstLastName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondLastName(String secondLastName) {
        this.secondLastName = secondLastName;
    }

    public String getSecondLastName() {
        return secondLastName;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    @Override
    public String getPersonFullName() {
        return Stream.of(getFirstName(), getSecondName(), getFirstLastName(), getSecondLastName())
                .filter(StringUtils::isNoneBlank)
                .collect(Collectors.joining(" "));
    }

    @PostConstruct
    private void postConstruct() {
        setType(PersonType.PHYSICAL);
    }

}
