package com.example.javaexample.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * test
 * @author 
 */
@Data
public class Test implements Serializable {
    private Integer id;

    private String username;

    private static final long serialVersionUID = 1L;
}