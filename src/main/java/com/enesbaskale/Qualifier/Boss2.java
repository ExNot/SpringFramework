package com.enesbaskale.Qualifier;

@QualifierMultiple
public class Boss2 implements BossInterface {
    @Override
    public String version(String data){
        return "QualifierMultiple 1" + data + ".";
    }
}
