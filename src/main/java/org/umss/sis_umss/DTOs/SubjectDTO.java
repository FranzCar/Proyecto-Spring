package org.umss.SIS_UMSS.DTOs;

import java.util.List;

public class SubjectDTO {

    private String uuid;
    private String name;
    private String code;
    private String description;
    private List<ProfessorDTO> professorDTOS;

    public SubjectDTO(String uuid, String name, String code) {
        this.uuid = uuid;
        this.name = name;
        this.code = code;
    }

    public SubjectDTO() {

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<ProfessorDTO> getProfessorDTOS() {
        return professorDTOS;
    }

    public void setProfessorDTOS(List<ProfessorDTO> professorDTOS) {
        this.professorDTOS = professorDTOS;
    }
}
