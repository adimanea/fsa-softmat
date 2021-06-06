package EcuatiiIntegraleFredholmVolterra;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 * Clasa principala Main
 */
public class Main extends Application {

    /**
     * Functia de afisare a graficului din JavaFX
     * @param stage
     */
    @Override
    public void start(Stage stage) {

        /*FredholmSpetaDoi fredholmSpetaDoi = new FredholmSpetaDoi();
        fredholmSpetaDoi.calculareTotala();
        Utilitar.afisareGrafic(stage, fredholmSpetaDoi, "Ecuatie Fredholm Speta Doi");*/

        Volterra volterra = new Volterra();
        volterra.calculareTotala();
        Utilitar.afisareGrafic(stage, volterra, "Ecuatie Volterra Speta Doi");
    }

    /**
     * Functia principala main
     * @param args argumentele functiei main
     */
    public static void main(String[] args) {
        launch(args);
    }
}
