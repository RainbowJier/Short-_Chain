package com.example.dcloud_account.controller.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: RainbowJier
 * @Description: 👺🐉😎账号注册实体类
 * @Date: 2024/10/5 14:28
 * @Version: 1.0
 */


@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountRegisterRequest {
    private String headImg;

    private String phone;

    private String pwd;

    private String mail;

    private String username;

    private String code;

}
