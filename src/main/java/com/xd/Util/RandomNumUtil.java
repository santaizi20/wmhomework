package com.xd.Util;

/**
 * Created by mac on 2019/5/6.
 */
public class RandomNumUtil {
public static long random(){
    long random=0;
    random=(long) (1+Math.random()*(1000000000-1+1));
    return random;
}

}
