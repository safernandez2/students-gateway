package com.example.students.repository

import com.example.students.model.Students
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface StudentsRepository : JpaRepository<Students, Long?>{
    fun findById(id: Long?): Students?
}