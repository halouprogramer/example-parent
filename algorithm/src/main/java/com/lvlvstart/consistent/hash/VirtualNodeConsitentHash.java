package com.lvlvstart.consistent.hash;

import java.util.SortedMap;
import java.util.TreeMap;

/**
 * @author lvzishu@hengbaobank.com
 * @description 类描述
 * @create 2021/6/8 14:36
 */
public class VirtualNodeConsitentHash implements LoadBanlance{


    private static final SortedMap<Integer, String> mapServer = new TreeMap<>();


    /**
     * 虚拟节点数量
     */
    private static final int virtualCount = 3;



    @Override
    public void addServer(String ip) {
        int hash = Math.abs(ip.hashCode());
        System.out.println("server hash:"+hash);
        mapServer.put(hash,ip);

        for(int i  = 0 ; i < 3 ; i++) {
            int virtualHash = (ip + "-"+i).hashCode();
            mapServer.put(virtualHash,ip);
        }
    }

    @Override
    public String getNearServer(String clientIp) {
        int hash = Math.abs(clientIp.hashCode());
        System.out.println("client hash:"+hash);
        SortedMap<Integer, String> tailMap = mapServer.tailMap(hash);
        if(tailMap.isEmpty()) {
            return mapServer.get(mapServer.firstKey());
        } else {
            return tailMap.get(tailMap.firstKey());
        }
    }
}
