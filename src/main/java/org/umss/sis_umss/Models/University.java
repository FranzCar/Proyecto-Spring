package org.umss.SIS_UMSS.Models;

import jakarta.persistence.*;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
@EntityListeners(AuditingEntityListener.class)
@SQLDelete(sql = "UPDATE university SET deleted = true WHERE id=?")
@Where(clause = "deleted = false")
public class University {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(updatable=false, nullable=false, unique = true, length=36)
    private String uuid;
    @Column(nullable=false, length=200)
    private String name;
    @Column(nullable=false, length=10)
    private String code;
    @CreatedDate
    @Column (updatable=false, columnDefinition = "timestamp without time zone NOT NULL DEFAULT CURRENT_TIMESTAMP")
    private Date createdDate;
    @LastModifiedDate
    @Column (updatable=true, columnDefinition = "timestamp without time zone NOT NULL DEFAULT CURRENT_TIMESTAMP")
    private Date modifiedDate;
    @OneToMany(mappedBy = "university", cascade = CascadeType.REMOVE)
    private List<Faculty> faculties;
    @Column(columnDefinition = "BOOLEAN NOT NULL DEFAULT '0'")
    private boolean deleted;




    public University(Integer id, String uuid, String name, String code, Date createdDate) {
        this.id = id;
        this.uuid = uuid;
        this.code = code;
        this.name = name;
        this.createdDate = createdDate;
    }

    public University() {
    }

    public University(String uuid) {
        this.uuid = uuid;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    @PrePersist
    public void initializeUuid(){
        this.setUuid(UUID.randomUUID().toString());
    }

    public List<Faculty> getFaculties() {
        return faculties;
    }

    public void setFaculties(List<Faculty> faculties) {
        this.faculties = faculties;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }
}
