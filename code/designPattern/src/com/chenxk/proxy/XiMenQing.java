package com.chenxk.proxy;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/8/9 12:58
 */
public class XiMenQing {
    public static void main(String[] args) {
        WangPo wangPo = new WangPo();
        wangPo.makeEyesWithMan();
        wangPo.happyWithMan();

        WangPo wangPo1 = new WangPo(new JiaShi());
        wangPo1.makeEyesWithMan();
        wangPo1.happyWithMan();
    }

}
