package com.chenxk.proxy;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/8/9 12:55
 */
public class WangPo implements KindWomen {

    private KindWomen kindWomen;

    public WangPo(){
        this.kindWomen = new PanJinLian();
    }

    public WangPo(KindWomen kindWomen){
        this.kindWomen = kindWomen;
    }

    @Override
    public void makeEyesWithMan() {
       this.kindWomen.makeEyesWithMan();
    }

    @Override
    public void happyWithMan() {
        this.kindWomen.happyWithMan();

    }
}
