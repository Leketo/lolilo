package com.leketo.lolilo.entity;


import com.leketo.lolilo.util.global.UuidProvider;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.UUID;

/**
 * Base class for entities with UUID identifier.
 * <p>
 * Inherit from it if you need an entity without optimistic locking, create, update and soft deletion info.
 */
@MappedSuperclass
public abstract class BaseUuidEntity implements HasUuid {

    @Id
    @Column(name = "ID")
    protected UUID id;

    public BaseUuidEntity() {
        this.id = UuidProvider.createUuid();
    }


    public UUID getId() {
        return id;
    }


    public void setId(UUID id) {
        this.id = id;
    }

    @Override
    public UUID getUuid() {
        return id;
    }

    public void setUuid(UUID uuid) {
        this.id = uuid;
    }


}
