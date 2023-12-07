package com.udea.Clase03.services;

import com.udea.Clase03.entity.Student;
import com.udea.Clase03.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    public Student getStudentById(Integer id) {
        return studentRepository.findById(id).orElse(null);
    }

    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    public List<Student> saveStudents(List<Student> students) {
        return studentRepository.saveAll(students);
    }

    public Student updateStudent(Student student) {
        Student existingStudent = studentRepository.findById(student.getId()).orElse(null);
        existingStudent.setName(student.getName());
        existingStudent.setAge(student.getAge());
        existingStudent.setAvailable(student.isAvailable());
        return studentRepository.save(existingStudent);
    }

    public boolean deleteStudent(Integer id) {
        studentRepository.deleteById(id);
        return true;
    }

    public boolean markStudentAvailable(Integer id) {
        Student student = studentRepository.findById(id).orElse(null);
        if (student != null) {
            student.setAvailable(true);
            studentRepository.save(student);
            return true;
        } else {
            // El estudiante no está presente en la base de datos.
            return false;
        }
    }
}
