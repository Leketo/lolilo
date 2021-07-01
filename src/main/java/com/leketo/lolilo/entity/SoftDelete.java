package com.leketo.lolilo.entity;

import java.time.LocalDate;


/**
 * Interface to be implemented by entities that support soft deletion.
 *
 */
public interface SoftDelete {

    /**
     * Returns true if the entity is deleted.
     */
    Boolean isDeleted();

    /**
     * Returns deletion timestamp or null if not deleted.
     */
    LocalDate getDeleteTs();

    /**
     * Returns login name of the user who deleted the entity
     * or null if not deleted.
     */
    String getDeletedBy();

    /**
     * INTERNAL. Sets soft deletion timestamp.
     */
    void setDeleteTs(LocalDate deleteTs);

    /**
     * INTERNAL. Sets login name of the user who deleted the entity.
     */
    void setDeletedBy(String deletedBy);



}
