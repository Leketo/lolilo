package com.leketo.lolilo.entity;

import java.time.LocalDate;

/**
 * Interface to be implemented by entities that contain information about who created them and when.
 */
public interface Creatable {

    LocalDate getCreateTs();

    void setCreateTs(LocalDate date);

    String getCreatedBy();

    void setCreatedBy(String createdBy);
}
