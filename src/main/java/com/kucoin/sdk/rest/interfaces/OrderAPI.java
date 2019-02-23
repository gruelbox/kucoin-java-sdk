/**
 * Copyright 2019 Mek Global Limited.
 */
package com.kucoin.sdk.rest.interfaces;

import java.io.IOException;

import com.kucoin.sdk.rest.request.OrderCreateApiRequest;
import com.kucoin.sdk.rest.response.OrderCancelResponse;
import com.kucoin.sdk.rest.response.OrderCreateResponse;
import com.kucoin.sdk.rest.response.OrderResponse;
import com.kucoin.sdk.rest.response.Pagination;

/**
 * Created by chenshiwei on 2019/1/9.
 */
public interface OrderAPI {

    /**
     * Place a new order
     * <p>
     * You can place two types of orders: limit and market. Orders can only be placed if your account has sufficient funds.
     * Once an order is placed, your account funds will be put on hold for the duration of the order.
     * How much and which funds are put on hold depends on the order type and parameters specified.
     * <p>
     * The maximum matching orders for a single trading pair in one account is 50 (stop limit order included).
     *
     * @param opsRequest
     * @return A response containing the order id.
     */
    OrderCreateResponse createOrder(OrderCreateApiRequest opsRequest) throws IOException;

    /**
     * Cancel an order
     * <p>
     * Cancel a previously placed order.
     *
     * @param orderId
     * @return A response containing the id of the cancelled order.
     */
    OrderCancelResponse cancelOrder(String orderId) throws IOException;

    /**
     * With best effort, cancel all open orders. The response is a list of ids of the canceled orders.
     *
     * @param symbol
     * @return A response containing the ids of all open orders.
     */
    OrderCancelResponse cancelAllOrders(String symbol) throws IOException;

    /**
     * Get a single order by order id.
     *
     * @param orderId
     * @return The requested order.
     */
    OrderResponse getOrder(String orderId) throws IOException;

    /**
     * List your current orders.
     *
     * @param symbol      [optional] Only list orders for a specific symbol.
     * @param side        [optional] buy or sell
     * @param type        [optional] limit, market, limit_stop or market_stop
     * @param status      [optional] active or done, done as default, Only list orders for a specific status .
     * @param startAt     [optional] Start time. unix timestamp calculated in milliseconds, the creation time queried shall posterior to the start time.
     * @param endAt       [optional] End time. unix timestamp calculated in milliseconds, the creation time queried shall prior to the end time.
     * @param pageSize
     * @param currentPage
     * @return A page of orders.
     */
    Pagination<OrderResponse> listOrders(String symbol, String side, String type, String status,
                                         Long startAt, Long endAt, int pageSize, int currentPage) throws IOException;

}
