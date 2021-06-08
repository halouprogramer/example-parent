package com.lvlvstart.algorithm.consistent.hash;

/**
 * @author lvzishu@hengbaobank.com
 * @description 测试负载算法
 * @create 2021/6/8 14:23
 */
public class TestMain {



    public static void main(String[] args) {


        String[] serverIp = new String[] {"47.101.65.106","47.103.87.53","171.186.84.36","234.95.142.184","238.69.219.203","121.172.193.159"};
        LoadBanlance loadBanlance = new ConsitentHash();

        for(String ip : serverIp) {
            loadBanlance.addServer(ip);
        }


        String[] clientServers = new String[] {"47.101.65.106","47.103.87.53","171.186.84.36","234.95.142.184","238.69.219.203","121.172.193.159"};
        for(String clientServer: clientServers) {
            String nearServer = loadBanlance.getNearServer(clientServer);
            System.out.println(nearServer);
        }


        System.out.println("========================================");
        //虚拟IP
        LoadBanlance virtualNodeConsitentHash = new VirtualNodeConsitentHash();

        for(String ip : serverIp) {
            virtualNodeConsitentHash.addServer(ip);
        }


        for(String clientServer: clientServers) {
            String nearServer = virtualNodeConsitentHash.getNearServer(clientServer);
            System.out.println(nearServer);
        }



    }



}
