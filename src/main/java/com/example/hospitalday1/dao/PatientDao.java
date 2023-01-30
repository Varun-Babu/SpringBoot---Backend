package com.example.hospitalday1.dao;

import com.example.hospitalday1.model.PatientModel;
import org.springframework.data.repository.CrudRepository;

public interface PatientDao extends CrudRepository<PatientModel,Integer> {
}
