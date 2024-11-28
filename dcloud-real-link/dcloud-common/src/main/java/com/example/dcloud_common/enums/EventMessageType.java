package com.example.dcloud_common.enums;

/**
 * @Author: RainbowJier
 * @Description: 👺🐉😎消息对象枚举类型
 * @Date: 2024/11/12 10:25
 * @Version: 1.0
 */

public enum EventMessageType {
    /**
     * 短链创建
     */
    SHORT_LINK_ADD,

    /**
     * C端
     */
    SHORT_LINK_ADD_LINK,

    SHORT_LINK_DEL_LINK,

    SHORT_LINK_UPDATE_LINK,

    /**
     * B端
     */
    SHORT_LINK_ADD_MAPPING,

    SHORT_LINK_DEL_MAPPING,

    SHORT_LINK_UPDATE_MAPPING,


    // ------------------ dcloud_shop ------------------
    /**
     * 新建商品订单
     */
    PRODUCT_ORDER_NEW,
}
