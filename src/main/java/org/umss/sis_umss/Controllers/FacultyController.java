package org.umss.SIS_UMSS.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.umss.SIS_UMSS.DTOs.FacultyDTO;
import org.umss.SIS_UMSS.Services.FacultyService;

@RestController
@RequestMapping("/faculties")
public class FacultyController {

    @Autowired
    private FacultyService facultyService;

    @GetMapping("{facultyUuid}")
    public FacultyDTO getFaculty(@PathVariable String facultyUuid) {
        return facultyService.getFaculty(facultyUuid);
    }

    @PostMapping
    public FacultyDTO create(@RequestBody FacultyDTO facultyDTO) {
        return facultyService.saveFaculty(facultyDTO);
    }
}
