package com.yh.bootdemo.model;

import lombok.Data;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Data
@Repository
public class User implements Serializable {
    private Integer id;
    private String username;
    private String password;
}
