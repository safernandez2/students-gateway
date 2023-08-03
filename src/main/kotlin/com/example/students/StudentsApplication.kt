package com.example.students

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class StudentsApplication

fun main(args: Array<String>) {
	runApplication<StudentsApplication>(*args)
}
