package com.chenxk.proxy;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/7/28 20:26
 */
public class XiMenQing {
    public static void main(String[] args) {
        PanJinLian panJinLian = new PanJinLian();
        WangPo wangPo = new WangPo(panJinLian);
        wangPo.makeEyesWithMen();
        wangPo.playWithMen();
    }
}
