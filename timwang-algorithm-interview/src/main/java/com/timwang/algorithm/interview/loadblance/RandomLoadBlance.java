package com.timwang.algorithm.interview.loadblance;

import java.util.List;
import java.util.Random;

/**
 * @author wangjun
 * @date 2020-07-02
 */
public class RandomLoadBlance {

    /**
     * 简单的随机负载均衡算法
     * @return ip
     */
    public static String getIp() {
        List<String> ipList = ServerInfos.getIpList();
        int randomIndex = new Random().nextInt(ipList.size());
        return ipList.get(randomIndex);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(getIp());
        }
    }
}
