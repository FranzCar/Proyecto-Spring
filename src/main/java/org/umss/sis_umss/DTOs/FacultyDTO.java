package org.umss.SIS_UMSS.DTOs;

public class FacultyDTO {

    private String uuid;
    private String code;
    private String name;
    private UniversityDTO university;

    public FacultyDTO(String uuid, String code, String name) {
        this.code = code;
        this.uuid = uuid;
        this.name = name;
    }

    public FacultyDTO() {
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

    public UniversityDTO getUniversity() {
        return university;
    }

    public void setUniversity(UniversityDTO university) {
        this.university = university;
    }
}
