package com.enesbaskale.alternative;

import jakarta.enterprise.inject.Alternative;

@Alternative
public class Boss1 implements BossInterface {
    //@Alternative:
    @Override
    public String version(String data){
        return "Boss1 " + data + ".";
    }
}
