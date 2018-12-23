package com.itheima.domain;

import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;

public class User implements Serializable {
    @Size(min=1,max = 6,message = "用户名长度不在1-6之间")
    private String username;
    @Pattern(regexp = "[0-9a-zA-Z]{6,12}",message = "密码是6-12个字符，必须是字母或数字组合")
    private String password;
    @Email(message = "请输入正确的邮箱地址")
    private String email;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
