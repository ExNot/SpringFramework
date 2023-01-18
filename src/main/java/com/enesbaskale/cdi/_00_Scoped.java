package com.enesbaskale.cdi;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.ConversationScoped;
import jakarta.enterprise.context.Dependent;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import jdk.jfr.Name;

//Kapsam
//Yaşam süresi
@Named
// @ApplicationScoped // Bütün uygulama boyunca çalışır.
// @RequestScoped // 1 istek boyunca çalışır.
// @SessionScoped // 1 kullanıcı için çalışır ancak logout olduğunda biter
// @Dependent //Bukalemun. Çağırılan class hangi scope ise o scope'a dönüşür.
// @ConversationScoped // Belli istek boyunca çalışır. (ürün sepete eklendikten sonra ödeme aşaması tamamlandığında bu sessionun anlamı kalmaz ve kapanır.)
// @SessionScoped // Bean 1 instanse olmasını sağlamak için kullanılır.
public class _00_Scoped {

}
