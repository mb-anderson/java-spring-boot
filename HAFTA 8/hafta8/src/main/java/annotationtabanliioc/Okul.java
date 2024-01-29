package annotationtabanliioc;

import org.springframework.stereotype.Component;

@Component("okul")
public class Okul implements Araci {
    @Override
    public void hareket(){
        System.out.println("Okul Kosuyor");
    }
}
