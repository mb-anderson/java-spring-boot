package loosecoupling;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        Araci araci = new Ogrenci();
        Kosanlar kosanlar = new Kosanlar(araci);
        kosanlar.kosmayaBasla();
    }
}
