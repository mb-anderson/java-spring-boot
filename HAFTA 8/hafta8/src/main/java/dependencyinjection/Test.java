package dependencyinjection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        String mesaj = "SELAM MUSTAFA BURAK YÜCEL";
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Konfigurasyon.class);
        Hoca hoca = applicationContext.getBean(Hoca.class);
        hoca.hareket(mesaj);
        Okul okul = applicationContext.getBean(Okul.class);
        okul.sendMessage(mesaj);

    }
}
