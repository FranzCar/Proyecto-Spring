package org.umss.SIS_UMSS.DTOs;

public class DepartmentDTO {
    private String uuid;
    private String code;
    private String name;
    private FacultyDTO facultyDTO;

    public DepartmentDTO(String uuid, String code, String name, FacultyDTO facultyDTO) {
        this.uuid = uuid;
        this.code = code;
        this.name = name;
        this.facultyDTO = facultyDTO;
    }

    public DepartmentDTO() {
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

    public FacultyDTO getFacultyDTO() {
        return facultyDTO;
    }

    public void setFacultyDTO(FacultyDTO facultyDTO) {
        this.facultyDTO = facultyDTO;
    }
}
