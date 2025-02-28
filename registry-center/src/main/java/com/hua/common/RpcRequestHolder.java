package com.hua.common;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author: Elon
 * @title: RpcRequestHolder
 * @projectName: Progressive-RPC-framework
 * @description:
 * @date: 2025/2/28 15:01
 */
public class RpcRequestHolder {

    // 请求id
    public final static AtomicLong REQUEST_ID_GEN = new AtomicLong(0);

    // 绑定请求
    public static final Map<Long, RpcFuture<RpcResponse>> REQUEST_MAP = new ConcurrentHashMap<>();

    public static Long getRequestId(){
        if (REQUEST_ID_GEN.longValue() == Long.MAX_VALUE){
            REQUEST_ID_GEN.set(0);
        }
        return REQUEST_ID_GEN.incrementAndGet();
    }
}
