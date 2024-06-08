package org.umss.SIS_UMSS.DTOs;

import java.util.List;

public class GroupDTO {
    private String uuid;
    private String name;
    private String code;
    private ProfessorDTO professorDTO;
    private List<ScheduleDTO> horarysDTO;
    private SubjectDTO subjectDTO;

    public GroupDTO(String name, String code, ProfessorDTO professorDTO) {
        this.name = name;
        this.code = code;
        this.professorDTO = professorDTO;
    }

    public GroupDTO() {
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

    public void setProfessorDTO(ProfessorDTO professorDTO) {
        this.professorDTO = professorDTO;
    }

    public List<ScheduleDTO> getScheduleDTO() {
        return horarysDTO;
    }

    public void setScheduleDTO(List<ScheduleDTO> scheduleDTO) {
        this.horarysDTO = scheduleDTO;
    }

    public ProfessorDTO getProfessorDTO() {
        return professorDTO;
    }

    public SubjectDTO getSubjectDTO() {
        return subjectDTO;
    }

    public void setSubjectDTO(SubjectDTO subjectDTO) {
        this.subjectDTO = subjectDTO;
    }
}
