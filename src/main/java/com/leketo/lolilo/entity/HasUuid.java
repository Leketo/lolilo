package com.leketo.lolilo.entity;

import java.util.UUID;

/**
 * Interface to be implemented by entities that have a persistent attribute of {@link UUID} type.
 */
public interface HasUuid {

    UUID getUuid();

    void setUuid(UUID uuid);

}
