package com.enesbaskale.alternative;

import jakarta.enterprise.inject.Alternative;

@Alternative
public class Boss1 implements BossInterface {
    //@Alternative: Aynı anda sadece 1 proje çalıştırır!!
    @Override
    public String version(String data){
        return "Boss1 " + data + ".";
    }
}
