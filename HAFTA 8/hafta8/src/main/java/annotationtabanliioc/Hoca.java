package annotationtabanliioc;

import org.springframework.stereotype.Component;

@Component("hoca")

public class Hoca implements Araci {
    @Override
    public void hareket(){
        System.out.println("Hoca Kosuyor");
    }
}
