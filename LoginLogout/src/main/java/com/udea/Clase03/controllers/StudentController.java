package com.udea.Clase03.controllers;

import com.udea.Clase03.entity.Student;
import com.udea.Clase03.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/addStudent")
    public RedirectView saveStudent(@ModelAttribute Student student, Model model){
        model.addAttribute(student);
        studentService.saveStudent(student);
        return new RedirectView("/students");
    }

    /*
    @GetMapping("/students")
    public List<Student> findAllStudents(){
        return studentService.getStudents();
    }
     */

    /*
    @GetMapping("/student/{id}")
    public Student findByID(@PathVariable Integer id){
        return studentService.getStudentById(id);
    }

     */

    @PostMapping("/addStudents")
    public List<Student> saveStudents(@RequestBody List<Student> students){
        return studentService.saveStudents(students);
    }

    // NUEVO PARA LA CLASE
    @PatchMapping("/student/{id}")
    public RedirectView updateStudent(@PathVariable("id") Integer id){
        studentService.markStudentAvailable(id);
        return new RedirectView("/students");
    }

    @DeleteMapping("/student/{id}")
    public RedirectView deleteStudent(@PathVariable("id") Integer id){
        studentService.deleteStudent(id);
        return new RedirectView("/students");
    }

    @PostMapping("/student/update")
    public RedirectView updateStudent(@ModelAttribute Student student) {
        studentService.updateStudent(student);
        return new RedirectView("/students");
    }


}
