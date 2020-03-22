package com.yh.bootdemo.model;

import lombok.Data;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.Date;

@Data
@Repository
public class  User implements Serializable {
    private Long id;
    private String userName;
    private String userPassWord;
    private String userEmail;
    private String userInfo;
    private byte[] headImg;
    private Date createTime;
}
