package com.chenxk.strategy;

import java.time.chrono.IsoChronology;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/8/9 12:37
 */
public class GivenGreenLight implements IStrategy {
    @Override
    public void operator() {
        System.out.println("求吴国太开个绿灯，放行！");
    }
}
