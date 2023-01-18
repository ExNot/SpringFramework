package com.enesbaskale;

import lombok.*;

//Data Transfer Object =DTO
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentDto {

    private Long studentId;
    private String studentName;
    private String studentSurname;

}
