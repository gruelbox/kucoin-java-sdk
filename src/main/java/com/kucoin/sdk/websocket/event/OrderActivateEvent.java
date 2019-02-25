/**
 * Copyright 2019 Mek Global Limited.
 */
package com.kucoin.sdk.websocket.event;

import java.math.BigDecimal;

import lombok.Data;

/**
 * Created by chenshiwei on 2019/1/23.
 */
@Data
public class OrderActivateEvent {

    private String sequence;

    private String symbol;

    private String side;

    private BigDecimal size;

    private String orderId;

    private BigDecimal price;

    private String time;

    private String type;

    private String orderType;

    private BigDecimal funds;

    private BigDecimal remainSize;

    private String reason;

    private String takerOrderId;

    private String makerOrderId;

    private String tradeId;

    private BigDecimal newSize;

    private BigDecimal oldSize;

    private String stopType;

}
