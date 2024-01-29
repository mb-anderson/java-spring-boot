import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Konfigurasyon.class);
        Okul okul = applicationContext.getBean(Okul.class);
        okul.hareket();
        Hoca hoca = applicationContext.getBean(Hoca.class);
        hoca.hareket();
        Kosanlar kosanlar = applicationContext.getBean(Kosanlar.class);
        kosanlar.kosmayaBasla();
    }
}
