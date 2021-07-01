package com.leketo.lolilo.entity;

import java.time.LocalDate;


/**
 * Interface to be implemented by entities that contain information about who updated them and when.
 */
public interface Updatable {

    LocalDate getUpdateTs();

    void setUpdateTs(LocalDate updateTs);

    String getUpdatedBy();

    void setUpdatedBy(String updatedBy);

}
