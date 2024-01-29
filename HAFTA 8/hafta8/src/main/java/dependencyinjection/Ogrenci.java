package dependencyinjection;

import org.springframework.stereotype.Component;

@Component
public class Ogrenci implements Araci {
    @Override
    public void hareket(String mesaj){
        System.out.println(mesaj);
    }
}
