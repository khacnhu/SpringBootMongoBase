package com.example.SpringbootMongoDB.Model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.lang.annotation.Documented;

@Data
@Document
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    @Id
    private Integer rno;

    private String name;

    private String address;



}
