package com.lip.common.constants;

public enum RpcInvoker {
    JDK("jdk");

    public String name;
    RpcInvoker(String type){
        this.name = type;
    }


}