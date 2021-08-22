package com.chenxk.proxy;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/7/28 20:20
 */
public class WangPo implements KindWomen {

    private KindWomen kindWomen;
    public WangPo(){

    }

    public WangPo(KindWomen kindWomen){
        this.kindWomen = kindWomen;
    }

    @Override
    public void makeEyesWithMen() {
        this.kindWomen.makeEyesWithMen();
    }

    @Override
    public void playWithMen() {
        this.kindWomen.playWithMen();

    }
}
