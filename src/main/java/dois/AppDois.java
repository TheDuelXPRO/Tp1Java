package dois;

import org.example.App;
import lombok.Data;

@Data
public class AppDois {
    public void segundoMetodo() {
        System.out.println("Segundo metodo ");

        App app = new App();
        app.primeiroMetodo();
    }
}

