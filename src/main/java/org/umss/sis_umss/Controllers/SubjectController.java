package org.umss.SIS_UMSS.Controllers;

import org.springframework.web.bind.annotation.*;
import org.umss.SIS_UMSS.DTOs.GroupDTO;
import org.umss.SIS_UMSS.DTOs.ScheduleDTO;
import org.umss.SIS_UMSS.DTOs.ProfessorDTO;
import org.umss.SIS_UMSS.DTOs.SubjectDTO;

import java.time.DayOfWeek;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/subjects")
public class SubjectController {

    @GetMapping("/{uuid}/groups")
    public List<GroupDTO> getAllGroups(@PathVariable String uuid) {
        GroupDTO groupDTO = new GroupDTO();
        groupDTO.setName("Grupo 1");
        groupDTO.setCode("G1");
        groupDTO.setProfessorDTO(new ProfessorDTO(UUID.randomUUID().toString(), "Roberto Gomez", 77902186, "rg@gmail.com"));
        groupDTO.setScheduleDTO(Collections.singletonList(new ScheduleDTO(DayOfWeek.MONDAY, "6:45", "8:15")));
        return Collections.singletonList(groupDTO);
    }

    @PostMapping("/{uuid}/groups")
    public GroupDTO createGroup(@PathVariable String uuid, @RequestBody GroupDTO groupDTO) {
        groupDTO.setUuid(UUID.randomUUID().toString());
        groupDTO.setProfessorDTO(new ProfessorDTO(groupDTO.getProfessorDTO().getUuid(), "Roberto Gomez", 77902186, "rg@gmail.com"));
        groupDTO.setSubjectDTO(new SubjectDTO(groupDTO.getSubjectDTO().getUuid(), "Introducción a la programación", "IntAProg"));
        return groupDTO;
    }

    @GetMapping("/{subject_uuid}/groups/{group_uuid}")
    public GroupDTO getGroup(@PathVariable String subject_uuid, @PathVariable String group_uuid) {
        GroupDTO groupDTO = new GroupDTO();
        groupDTO.setName("Grupo 1");
        groupDTO.setCode("G1");
        groupDTO.setProfessorDTO(new ProfessorDTO(UUID.randomUUID().toString(), "Roberto Gomez", 77902186, "rg@gmail.com"));
        groupDTO.setScheduleDTO(Collections.singletonList(new ScheduleDTO(DayOfWeek.MONDAY, "6:45", "8:15")));
        return groupDTO;
    }
}
