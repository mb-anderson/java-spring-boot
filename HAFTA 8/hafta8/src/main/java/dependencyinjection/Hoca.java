package dependencyinjection;

import org.springframework.stereotype.Component;

@Component("hoca")
public class Hoca implements Araci {
    @Override
    public void hareket(String mesaj){
        System.out.println(mesaj);
    }
}
