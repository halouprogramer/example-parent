package com.lvlvstart.algorithm.consistent.hash;

import java.util.SortedMap;
import java.util.TreeMap;

/**
 * @author lvzishu@hengbaobank.com
 * @description 一致性Hash算法
 * @create 2021/6/8 14:15
 */
public class ConsitentHash implements LoadBanlance{

    private static final SortedMap<Integer, String> mapServer = new TreeMap<>();

    @Override
    public void addServer(String ip) {
        int hash = Math.abs(ip.hashCode());
        System.out.println("server hash:"+hash);
        mapServer.put(hash,ip);
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
