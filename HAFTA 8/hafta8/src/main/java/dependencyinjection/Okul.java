package dependencyinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Okul {
    private Araci araci;
    @Autowired
    public Okul(@Qualifier("hoca") Araci araci){
        this.araci = araci;
    }

    public void sendMessage(String mesaj){
        this.araci.hareket(mesaj);
    }
}
