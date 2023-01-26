package com.enesbaskale.aop.interceptor;

import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@Interceptor
@InterceptorYolKesici
public class InterceptorYolKesiciAsilIs {

    @AroundInvoke public Object loglama(InvocationContext context){
        System.out.println("Ilk hali: " + context.getMethod().getName());

        //kullanıcı: Giriş yapmış mı?
        boolean isLogin = true; // true: İlk önce login olmalı / Yol kesici olacak değişken!
        //jdbc : session?
        Object isContinue = null; // Eğer yol kesilmezse devam edecek

        if (isLogin){
            // Önce sisteme giriş yapsın
            System.out.println("!!! Önce sisteme giriş yapsın");
            return null;
        }
        else {
            try {
                isContinue = context.proceed(); // Devam etmesini sağlamak!
                System.out.println("Sonraki hali " + isContinue);
            }catch (Exception e){
                e.printStackTrace();
            }
            return isContinue;
        }

    }

}
