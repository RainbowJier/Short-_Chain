package com.example.dcloud_link.service;


import com.example.dcloud_common.util.JsonData;
import com.example.dcloud_link.controller.request.LinkGroupRequest;

/**
 * (LinkGroup)表服务接口
 *
 * @author makejava
 * @since 2024-10-29 14:02:07
 */
public interface LinkGroupService{

    /**
     * 新增分组
     */
    JsonData add(LinkGroupRequest addRequest);

    /**
     * 校验分组名称是否存在
     */
    boolean checkGroupExists(String title);

    /**
     * 删除分组
     */
    JsonData del(Long groupId);
}

