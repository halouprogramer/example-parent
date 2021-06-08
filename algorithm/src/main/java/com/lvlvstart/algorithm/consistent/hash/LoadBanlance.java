package com.lvlvstart.algorithm.consistent.hash;

import java.util.List;

public interface LoadBanlance {


    /**
     * 添加服务器节点
     * @param ip
     * @return
     */
    public void addServer(String ip);


    /**
     * 选择服务落地
     * @param clientIp
     */
    public String getNearServer(String clientIp);



}
