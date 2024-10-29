package com.example.manager;

import com.example.entity.Account;

import java.util.List;

/**
 * @author RainbowJier
 * @since 2024-08-17
 */
public interface AccountManager{

    /**
     * 新增用户
     */
    int insert(Account account);


    /**
     * 根据手机号查找账号
     */
    List<Account> selectByPhone(String phone);
}