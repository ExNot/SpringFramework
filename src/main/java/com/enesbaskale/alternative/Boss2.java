package com.enesbaskale.alternative;

import jakarta.enterprise.inject.Alternative;

@Alternative
public class Boss2 implements BossInterface {
    @Override
    public String version(String data){
        return "Boss2 " + data + ".";
    }
}
