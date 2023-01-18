package com.enesbaskale.Qualifier;

import jakarta.enterprise.inject.Default;

@Default
public class Boss1 implements BossInterface {
    //@Alternative: Aynı anda sadece 1 proje çalıştırır!!
    @Override
    public String version(String data){
        return "QualifierMultiple " + data + ".";
    }
}
