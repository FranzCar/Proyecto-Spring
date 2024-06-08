package org.umss.SIS_UMSS.DTOs;


import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;


public class UniversityDTO {

    private String uuid;
    @NotNull
    @Size(min = 2, max = 20)
    private String code;
    @NotNull
    @Size(min = 2, max = 200)
    private String name;

    public UniversityDTO(String uuid, String code, String name) {
        this.uuid = uuid;
        this.code = code;
        this.name= name;
    }

    public UniversityDTO() {
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
}
