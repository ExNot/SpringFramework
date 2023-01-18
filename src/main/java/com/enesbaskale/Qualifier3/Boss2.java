package com.enesbaskale.Qualifier3;

@QualifierMultiple2(EFazlaSecenekler.FIRST)
public class Boss2 implements BossInterface {
    @Override
    public String version(String data){
        return "QualifierMultiple ENUM 1." + data + ".";
    }
}
