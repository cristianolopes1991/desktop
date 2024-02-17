package conta.tela;

import conta.dsv.Build2;
import javafx.application.Application;
import javafx.stage.Stage;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AdaptadoraJavaFx extends Application {

    private ApplicationContext spring;

    @Override
    public void init() throws Exception {
        System.out.println("Iniciando spring.");
        spring = new AnnotationConfigApplicationContext(Build2.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        var form = spring.getBean(TransferenciaFrm.class);
        form.mostrar(stage);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
