package co.ke.usiuworkshop.msstudentbackend.model;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class StudentResponse {

    private String studentName;
    private int code;
    private String message;

}
