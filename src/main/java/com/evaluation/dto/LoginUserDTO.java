package com.evaluation.dto;

import lombok.Data;

/**
 * @author: xieyong
 * @date: 2019/4/26 00:08
 * @Description:
 */
@Data
public class LoginUserDTO {

    private Long id;

    private String username;

    private String password;

    public Long getId() {
        return this.id;
    }
    public String getUsername() {
        return this.username;
    }
    public String getPassword() {
        return this.password;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
