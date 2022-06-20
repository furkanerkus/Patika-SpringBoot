package com.furkanerkus.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

import javax.validation.constraints.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Log4j2
public class TeacherDTO {

    private Long teacherId;

    @NotEmpty(message = "ad soyad alanını boş geçemezsiniz.")
    @Size(min = 1, max = 100)
    private String teacherNameSurname;

    @NotEmpty(message = "email alanını boş geçemezsiniz.")
    @Email(message = "uygun formatta mail girmediniz.")
    private String teacherEmail;

    @NotEmpty(message = "şifre alanını boş geçemezsiniz.")
    @Size(min = 6, max = 18)
    private String teacherPassword;
}
