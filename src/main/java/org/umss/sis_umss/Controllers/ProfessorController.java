package org.umss.SIS_UMSS.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.umss.SIS_UMSS.DTOs.GroupDTO;
import org.umss.SIS_UMSS.DTOs.ScheduleDTO;
import org.umss.SIS_UMSS.DTOs.SubjectDTO;

import java.time.DayOfWeek;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/professors")
public class ProfessorController {
    @GetMapping("/{professorUuid}/groups")
    public List<GroupDTO> getAllProfessorGroups(@PathVariable String professorUuid){
        GroupDTO groupDTO = new GroupDTO();
        groupDTO.setName("Grupo 1");
        groupDTO.setCode("G1");
        groupDTO.setSubjectDTO(new SubjectDTO(UUID.randomUUID().toString(), "Introducción a la programación", "IntAProg"));
        groupDTO.setScheduleDTO(Collections.singletonList(new ScheduleDTO(DayOfWeek.MONDAY, "6:45", "8:15")));
        return Collections.singletonList(groupDTO);
    }
}
