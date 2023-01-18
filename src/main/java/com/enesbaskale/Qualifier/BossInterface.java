package com.enesbaskale.Qualifier;

public interface BossInterface {
    //@Alternative: Aynı anda sadece 1 proje çalıştırır!!
    //@Qualifier: Aynı anda 1den fazla proje çalıştırır ancak default olarak çalışacak projeyi seçebiliyoruz!!
    public String version(String data);

}
