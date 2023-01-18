package com.enesbaskale.cdi;

import com.enesbaskale.StudentDto;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.New;
import jakarta.enterprise.inject.Produces;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import lombok.Getter;

@Named(value = "newtuto")
@ApplicationScoped

public class _04_New {
    //Üretilen
    @Produces
    public String uretilenData(@New StudentDto studentDto){
        studentDto = StudentDto.builder()
                .studentId(0L)
                .studentName("student Adi")
                .build();
        return studentDto.getStudentName();
    }
    @Getter
    @Inject
    private String tuketilenData;

}
