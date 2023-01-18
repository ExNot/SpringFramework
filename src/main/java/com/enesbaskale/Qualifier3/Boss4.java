package com.enesbaskale.Qualifier3;

@QualifierMultiple2(EFazlaSecenekler.THIRD)
public class Boss4 implements BossInterface {
    @Override
    public String version(String data){
        return "QualifierMultiple ENUM 3. " + data + ".";
    }
}
