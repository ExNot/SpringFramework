package com.enesbaskale.Qualifier3;

@QualifierMultiple2(EFazlaSecenekler.SECOND)
public class Boss3 implements BossInterface {
    @Override
    public String version(String data){
        return "QualifierMultiple ENUM 2. " + data + ".";
    }
}
