package com.enesbaskale.alternative;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named(value = "alternativedi")
@ApplicationScoped
public class Employee {

    @Inject
    private BossInterface bossInterface;

    public String getData(String data){
        return bossInterface.version(data);
    }

}
