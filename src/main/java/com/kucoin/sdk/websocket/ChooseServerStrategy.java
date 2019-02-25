/**
 * Copyright 2019 Mek Global Limited.
 */
package com.kucoin.sdk.websocket;

import com.kucoin.sdk.model.InstanceServer;

import java.util.List;

/**
 * Created by chenshiwei on 2019/1/24.
 */
public interface ChooseServerStrategy {

    /**
     * For choose web socket connect server
     *
     * @param servers
     * @return A server instance.
     */
    InstanceServer choose(List<InstanceServer> servers);

}
