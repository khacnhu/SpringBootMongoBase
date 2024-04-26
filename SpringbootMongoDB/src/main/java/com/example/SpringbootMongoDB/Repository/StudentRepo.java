package com.example.SpringbootMongoDB.Repository;

import com.example.SpringbootMongoDB.Model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends MongoRepository<Student, Integer> {




}
