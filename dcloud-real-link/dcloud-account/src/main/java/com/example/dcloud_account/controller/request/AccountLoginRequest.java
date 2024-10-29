package com.example.dcloud_account.controller.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: RainbowJier
 * @Description: 👺🐉😎
 * @Date: 2024/10/5 16:12
 * @Version: 1.0
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountLoginRequest {

    /**
     * 手机号
     */
    private String phone;

    /**
     * 密码
     */
    private String pwd;
}
