package com.enesbaskale.Qualifier;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named(value = "qualifierCdi")
@ApplicationScoped
public class Employee {
  /*  //defaultta çalışacak kodlar
    @Inject
    private BossInterface bossInterface;*/

    //defaultta çalışacak kodlar
    @Inject
    @QualifierMultiple
    private BossInterface bossInterface;

    public String getData(String data){
        return bossInterface.version(data);
    }

}
