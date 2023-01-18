package com.enesbaskale.Qualifier;

import jakarta.enterprise.inject.Default;

@QualifierMultiple
public class Boss2 implements BossInterface {
    @Override
    public String version(String data){
        return "Default " + data + ".";
    }
}
