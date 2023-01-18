package com.enesbaskale.ioc_di;

public class Boss implements BossInterface {
    @Override
    public String version(String data){
        return "Version " + data + ".";
    }
}
