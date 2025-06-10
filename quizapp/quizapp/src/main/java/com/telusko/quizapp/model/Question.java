package com.telusko.quizapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Question {

//    ORM - Object relational Mapping
//    class name = Table name
//    class Field = Table cloumn
//    each object will represent a row

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //if this doesnt work use IDENTITY
    private Integer id;
    private String questionTitle;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String rightAnswer;
    private String difficultylevel;
    private String category;

//  Note: java fields use camelCasing and postgres use Snake_Casing(and this gets handled)


}
