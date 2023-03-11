package org.example.seminar3.hw3.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Books {

    private String name;
    private String author;
    private Double price;
    private Integer year;
    private Integer pgNum;


}