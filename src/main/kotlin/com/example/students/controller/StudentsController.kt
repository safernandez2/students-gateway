package com.example.students.controller

import com.example.students.model.Students
import com.example.students.service.StudentsService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/students")
class StudentsController {
    @Autowired
    lateinit var studentsService: StudentsService
    @GetMapping
    fun list():List<Students>{
        return studentsService.list()
    }
}