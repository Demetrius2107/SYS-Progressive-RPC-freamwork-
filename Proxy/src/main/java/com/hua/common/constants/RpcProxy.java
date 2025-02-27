package com.hua.common.constants;

/**
 * @author: Elon
 * @title: RpcProxy
 * @projectName: Progressive-RPC-framework
 * @description:
 * @date: 2025/2/26 23:10
 */
public enum RpcProxy {

    CG_LIB("cglib");

    public String name;

    RpcProxy(String type) {
        this.name = name;
    }

    public static RpcProxy get(String type) {
        for (RpcProxy value : values()) {
            if (value.name.equals(type)) {
                return value;
            }
        }
        return null;
    }
}
