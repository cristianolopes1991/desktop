package conta.dsv;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({
        //adaptadores front-end javafx
        "conta.dsv",
        "conta.tela",
        "conta.sistema",
        "conta.adaptador",
})
public class Build2 {
}
