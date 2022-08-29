package com.root.student;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    Logger logger = LoggerFactory.getLogger(StudentService.class);

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService =studentService;
    }

    @GetMapping
    public List<Student> getStudents() {
        String methodName = "getStudents";
        logger.info(methodName + ":" + " invoking getStudents");
        return studentService.getStudent();
    }

    @PostMapping
    public void addStudent(@RequestBody Student student) {

        studentService.addStudent(student);
    }
    @DeleteMapping(path =  "{studentId}")
    public void deleteStudent(@PathVariable Long studentId){
        studentService.deleteStudent(studentId);
    }
    @PutMapping(path = "{studentId}")
    public void updateStudent(@PathVariable Long studentId, @RequestParam String name, @RequestParam String email){
        studentService.updateStudent(studentId,name,email);
    }

}
