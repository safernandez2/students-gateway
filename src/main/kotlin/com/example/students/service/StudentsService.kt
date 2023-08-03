package com.example.students.service

import com.example.students.model.Students
import com.example.students.repository.StudentsRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class StudentsService {
    @Autowired
    lateinit var studentsRepository: StudentsRepository
    fun list ():List<Students>{
        return studentsRepository.findAll()
    }
}