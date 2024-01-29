package annotationtabanliioc;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("kosanlar")
public class Kosanlar {
    private Araci araci;
    public Kosanlar(@Qualifier("hoca") Araci araci){
        this.araci = araci;
    }
    public void kosmayaBasla(){
        this.araci.hareket();
    }
}
