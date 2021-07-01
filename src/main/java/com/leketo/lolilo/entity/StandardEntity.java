package com.leketo.lolilo.entity;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;
import java.time.LocalDate;


/**
 * The most widely used base class for entities. <br>
 * Optimistically locked, implements Updatable and SoftDelete.
 */
@MappedSuperclass
public class StandardEntity extends BaseUuidEntity implements Versioned, Creatable, Updatable, SoftDelete {

    @Version
    @Column(name = "VERSION", nullable = false)
    protected Integer version;

    @Column(name = "CREATE_TS")
    protected LocalDate createTs;

    @Column(name = "CREATED_BY", length = 50)
    protected String createdBy;

    @Column(name = "UPDATE_TS")
    protected LocalDate updateTs;

    @Column(name = "UPDATED_BY", length = 50)
    protected String updatedBy;

    @Column(name = "DELETE_TS")
    protected LocalDate deleteTs;

    @Column(name = "DELETED_BY", length = 50)
    protected String deletedBy;

    @Override
    public Integer getVersion() {
        return version;
    }

    @Override
    public void setVersion(Integer version) {
        this.version = version;
    }

    @Override
    public LocalDate getCreateTs() {
        return createTs;
    }

    @Override
    public void setCreateTs(LocalDate createTs) {
        this.createTs = createTs;
    }

    @Override
    public String getCreatedBy() {
        return createdBy;
    }

    @Override
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    @Override
    public LocalDate getUpdateTs() {
        return updateTs;
    }

    @Override
    public void setUpdateTs(LocalDate updateTs) {
        this.updateTs = updateTs;
    }

    @Override
    public String getUpdatedBy() {
        return updatedBy;
    }

    @Override
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    @Override
    public Boolean isDeleted() {
        return deleteTs != null;
    }

    @Override
    public LocalDate getDeleteTs() {
        return deleteTs;
    }

    @Override
    public void setDeleteTs(LocalDate deleteTs) {
        this.deleteTs = deleteTs;
    }

    @Override
    public String getDeletedBy() {
        return deletedBy;
    }

    @Override
    public void setDeletedBy(String deletedBy) {
        this.deletedBy = deletedBy;
    }
}
