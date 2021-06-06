package EcuatiiIntegraleFredholmVolterra;

import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

import java.util.LinkedList;
import java.util.List;

/**
 * Aceasta clasa este un utilitar pentru afisarea graficului
 */
public class Utilitar {
    public static final NumberAxis xAxis = new NumberAxis();
    public static final NumberAxis yAxis = new NumberAxis();
    public static final LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
    public static List<XYChart.Series> s = new LinkedList<>();
    public static XYChart.Series series;
    public static Scene scene;

    /**
     * Functia care afiseaza graficul pentru un obiect de tip FredholmVolterra
     *
     * @param stage
     * @param fredholmVolterra obiectul FredholmSpetaDoi sau Volterra
     * @param titlu            titlul graficului
     */
    public static void afisareGrafic(Stage stage, FredholmVolterra fredholmVolterra, String titlu) {
        stage.setTitle(titlu);

        xAxis.setLabel("Numar iteratii");

        lineChart.setTitle(titlu);

        adaugareDateGrafic(fredholmVolterra);

        scene = new Scene(lineChart, 800, 600);
        for (int i = 0; i < fredholmVolterra.getN(); ++i) {
            lineChart.getData().addAll(s.get(i));
        }

        stage.setScene(scene);
        stage.show();
    }

    /**
     * Functia care adauga valorile in grafic ale unui obiect de tip FredholmVolterra
     *
     * @param fredholmVolterra obiectul FredholmSpetaDoi sau Volterra
     */
    private static void adaugareDateGrafic(FredholmVolterra fredholmVolterra) {
        for (int i = 0; i < fredholmVolterra.getN(); ++i) {
            series = new XYChart.Series();
            series.setName("Iteratia " + (i + 1));
            for (int j = 0; j < fredholmVolterra.getI(); ++j) {
                series.getData().add(new XYChart.Data(j + 1, fredholmVolterra.getU().get(i).get(j)));
            }
            s.add(series);
        }
    }
}
