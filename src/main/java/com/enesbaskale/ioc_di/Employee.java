package com.enesbaskale.ioc_di;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named(value = "IOC_DI")
@ApplicationScoped
public class Employee {

    @Inject
    private BossInterface bossInterface;
    //Parameterless constructor
    public Employee(){
        //bossInterface = new Boss();

    }

    public String getData(String data){
        return bossInterface.version(data);
    }

}
