package com.telusko.quizapp.dao;

import com.telusko.quizapp.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionDao extends JpaRepository<Question,Integer> {

    List<Question> findByCategory(String category);

    @Query(value = "SELECT * FROM question q WHERE q.category=:category ORDER BY RANDOM() LIMIT :numQ ", nativeQuery = true)
    List<Question> findRandomQuestionsByCatrgory(String category, int numQ);
}

//DataJpa helps us avoid the 7 steps to fetch data that we do using JDBC
//Simply create an interface and extend JpaRepository<Class Name(i.e. table name),PrimaryKey type>