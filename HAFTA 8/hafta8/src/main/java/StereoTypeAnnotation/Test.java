package StereoTypeAnnotation;

import StereoTypeAnnotation.Controller.IlkController;
import StereoTypeAnnotation.Repository.IlkRepository;
import StereoTypeAnnotation.Service.IlkService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Konfigurasyon.class);
        IlkController demoController = applicationContext.getBean(IlkController.class);
        System.out.println(demoController.ilk());
        IlkRepository demoRepository = applicationContext.getBean(IlkRepository.class);
        System.out.println(demoRepository.ilk());
        IlkService demoService = applicationContext.getBean(IlkService.class);
        System.out.println(demoService.ilk());
    }
}
