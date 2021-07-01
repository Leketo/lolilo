package com.leketo.lolilo.entity;


import org.apache.commons.lang3.StringUtils;
import py.com.premedic.entity.annotation.SystemLevel;

import javax.persistence.Column;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.time.ZoneId;

@javax.persistence.Entity(name = "sys$FileDescriptor")
@Table(name = "SYS_FILE")
@SystemLevel
public class FileDescriptor extends StandardEntity  {

    @Column(name = "NAME", length = 500, nullable = false)
    private String name;

    @Column(name = "EXT", length = 20)
    private String extension;

    @Column(name = "FILE_SIZE")
    private Long size;

    @Column(name = "CREATE_DATE")
    private LocalDateTime createDate;

    @SystemLevel
    @Column(name = "SYS_TENANT_ID")
    protected String sysTenantId;

    /**
     * @return file uploading timestamp
     */
    public LocalDateTime  getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    /**
     * @return file name including extension
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return file extension, i.e. the part of name after the last dot
     */
    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = StringUtils.substring(extension, 0, 20);
    }

    /**
     * @return file size in bytes
     */
    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public String getSysTenantId() {
        return sysTenantId;
    }

    public void setSysTenantId(String sysTenantId) {
        this.sysTenantId = sysTenantId;
    }

    /**
     * Used by the framework to transfer file between application tiers.
     */
    public String toUrlParam() {
        StringBuilder strBuilder = new StringBuilder()
                .append(id).append(",")
                .append(extension).append(",")
                .append(createDate.atZone(
                        ZoneId.systemDefault())
                        .toInstant().toEpochMilli());
        if (size != null) {
            strBuilder.append(",").append(size);
        }
        return strBuilder.toString();
    }

}
