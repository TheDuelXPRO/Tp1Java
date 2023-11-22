package tres;

import dois.AppDois;
import lombok.Data;

@Data
public class AppTres {
    public void terceiroMetodo() {
        System.out.println("Terceiro metodo ");

        AppDois appdois = new AppDois();
        appdois.segundoMetodo();
    }
}
