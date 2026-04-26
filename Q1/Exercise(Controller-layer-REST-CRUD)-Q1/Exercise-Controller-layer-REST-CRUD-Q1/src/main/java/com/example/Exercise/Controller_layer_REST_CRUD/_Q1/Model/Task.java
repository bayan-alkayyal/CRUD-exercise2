package com.example.Exercise.Controller_layer_REST_CRUD._Q1.Model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Task {

    private String id ;
    private String title ;
    private String description ;
    private boolean status ;

}
