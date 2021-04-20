package EcuatiiIntegraleFredholmVolterra;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

import java.util.LinkedList;
import java.util.List;

public class Main extends Application {

    @Override
    public void start(Stage stage) {

        FredholmSpetaUnu fredholmSpetaUnu = new FredholmSpetaUnu();


        fredholmSpetaUnu.calculareTotala();


        stage.setTitle("Ecuatie Fredholm Speta Unu");

        final NumberAxis xAxis = new NumberAxis();
        final NumberAxis yAxis = new NumberAxis();
        xAxis.setLabel("Numar iteratii");

        final LineChart<Number, Number> lineChart =
                new LineChart<Number, Number>(xAxis, yAxis);

        lineChart.setTitle("Ecuatie Fredholm Speta Unu");

        List<XYChart.Series> s = new LinkedList<XYChart.Series>();

        for (int i = 0; i < fredholmSpetaUnu.getN(); ++i) {
            XYChart.Series series = new XYChart.Series();
            series.setName("Iteratia " + (i + 1));
            for (int j = 0; j < fredholmSpetaUnu.getI(); ++j) {
                series.getData().add(new XYChart.Data(j + 1, fredholmSpetaUnu.getU().get(i).get(j)));
            }
            s.add(series);
        }


        Scene scene = new Scene(lineChart, 800, 600);
        for (int i = 0; i < fredholmSpetaUnu.getN(); ++i) {
            lineChart.getData().addAll(s.get(i));
        }

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
