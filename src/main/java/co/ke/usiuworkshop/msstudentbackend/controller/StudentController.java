package co.ke.usiuworkshop.msstudentbackend.controller;

import co.ke.usiuworkshop.msstudentbackend.model.StudentRequest;
import co.ke.usiuworkshop.msstudentbackend.model.StudentResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/student")
public class StudentController {

    @PostMapping("/request")
    ResponseEntity<StudentResponse> createGitlabGroup(@RequestBody StudentRequest studentRequest){
        StudentResponse gitlabResponse = new StudentResponse(studentRequest.getStudentName(), 200, "Successful");

        return ResponseEntity.status(HttpStatus.OK).body(gitlabResponse);
    }


}
