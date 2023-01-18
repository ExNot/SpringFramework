package com.enesbaskale.Qualifier3;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named(value = "qualifier3Cdi")
@ApplicationScoped
public class Employee {
    //defaultta çalışacak kodlar
   /* @Inject
    private BossInterface bossInterface;*/

    //istediğimiz seçenekte çalışacak kodlar
    /*@Inject
    @QualifierMultiple2(EFazlaSecenekler.FIRST)
    private BossInterface bossInterface;*/

  /*  @Inject
    @QualifierMultiple2(EFazlaSecenekler.SECOND)
    private BossInterface bossInterface;*/

    @Inject
    @QualifierMultiple2(EFazlaSecenekler.THIRD)
    private BossInterface bossInterface;
    public String getData(String data){
        return bossInterface.version(data);
    }

}
