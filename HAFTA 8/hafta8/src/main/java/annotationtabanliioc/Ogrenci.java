package annotationtabanliioc;

import org.springframework.stereotype.Component;

@Component("ogrenci")
public class Ogrenci implements Araci {
    @Override
    public void hareket(){
        System.out.println("Ogrenci Kosuyor");
    }
}
