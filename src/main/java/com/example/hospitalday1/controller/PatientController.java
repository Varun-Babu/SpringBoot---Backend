package com.example.hospitalday1.controller;


import com.example.hospitalday1.dao.PatientDao;
import com.example.hospitalday1.model.PatientModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
public class PatientController {

    @Autowired
    private PatientDao dao;

    @PostMapping(path = "/add", consumes = "application/json", produces = "application/json")
    public HashMap<String ,String> Add(@RequestBody PatientModel p){
        dao.save(p);
        HashMap<String,String> map = new HashMap<>();
        map.put("status","success");
        return map;
    }

    @GetMapping("/view")
    public List<PatientModel> view(){
        return(List<PatientModel>) dao.findAll();
    }
}
