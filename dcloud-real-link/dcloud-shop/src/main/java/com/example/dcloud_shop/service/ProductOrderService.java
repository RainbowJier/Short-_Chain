package com.example.dcloud_shop.service;

import com.example.dcloud_common.util.JsonData;
import com.example.dcloud_shop.controller.request.ConfirmOrderRequest;
import com.example.dcloud_shop.entity.ProductOrder;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author RainbowJier
 * @since 2024-11-23
 */
public interface ProductOrderService {

    /**
     * 分页查询
     */
    Map<String, Object> page(int page, int size, String state);

    /**
     * 查询订单状态
     */
    String queryProductrOrderState(String outTradeNo);

    /**
     * 创建订单
     */
    JsonData confirmOrder(ConfirmOrderRequest confirmOrderRequest);
}