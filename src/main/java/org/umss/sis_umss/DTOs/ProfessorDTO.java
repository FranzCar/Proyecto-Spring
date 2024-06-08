package org.umss.SIS_UMSS.DTOs;

import java.util.List;

public class ProfessorDTO {
    private String uuid;
    private String name;
    private int phone;
    private String email;
    private List<SubjectDTO> subjectDTOS;

    public ProfessorDTO(String uuid, String name, int phone, String email) {
        this.uuid = uuid;
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public ProfessorDTO() {
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

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public List<SubjectDTO> getSubjects() {
        return subjectDTOS;
    }

    public void setSubjects(List<SubjectDTO> subjectDTOS) {
        this.subjectDTOS = subjectDTOS;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
