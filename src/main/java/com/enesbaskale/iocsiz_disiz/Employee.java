package com.enesbaskale.iocsiz_disiz;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

@Named(value = "cdisizEmployee")
@ApplicationScoped
public class Employee {

    private Boss boss;
    //Parameterless constructor
    public Employee(){
        boss = new Boss();
    }

    public String getData(String data){
        return boss.version(data);
    }

}
