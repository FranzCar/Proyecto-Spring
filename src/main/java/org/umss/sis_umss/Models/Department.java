package org.umss.SIS_UMSS.Models;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.Date;

@Entity
public class Department {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(updatable=false, nullable=false, unique = true, length=36)
    private String uuid;
    @Column(updatable=false, nullable=false, length=200)
    private String name;
    @Column(updatable=false, nullable=false, length=10)
    private String code;
    @ManyToOne(fetch = FetchType.LAZY)
    private Faculty faculty;
    @CreatedDate
    @Column (updatable=false, columnDefinition = "timestamp without time zone NOT NULL DEFAULT CURRENT_TIMESTAMP")
    private Date createdDate;
    @Column (updatable=true, columnDefinition = "timestamp without time zone NOT NULL DEFAULT CURRENT_TIMESTAMP")
    @LastModifiedDate
    private Date lastModifiedDate;
    @Column(columnDefinition = "BOOLEAN NOT NULL DEFAULT '0'")
    private boolean deleted;

    public Department() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

}
