package EcuatiiIntegraleFredholmVolterra;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Main extends Application {

    @Override
    public void start(Stage stage) {

        FredholmSpetaUnu fredholmSpetaUnu = new FredholmSpetaUnu();


        double[][] u;
        u = fredholmSpetaUnu.getU();
        fredholmSpetaUnu.calculareTotala();


        stage.setTitle("Ecuatie FredholmSpetaUnu");
        //defining the axes
        final NumberAxis xAxis = new NumberAxis();
        final NumberAxis yAxis = new NumberAxis();
        xAxis.setLabel("Numar iteratii");
        //creating the chart
        final LineChart<Number, Number> lineChart =
                new LineChart<Number, Number>(xAxis, yAxis);

        lineChart.setTitle("Ecuatie FredholmSpetaUnu");

        ArrayList<XYChart.Series> s = new ArrayList<XYChart.Series>();

        for (int i = 0; i < fredholmSpetaUnu.getN(); ++i) {
            //defining a series
            XYChart.Series series = new XYChart.Series();
            series.setName("Iteratia " + Integer.toString(i + 1));
            for (int j = 0; j < fredholmSpetaUnu.getI(); ++j) {
                series.getData().add(new XYChart.Data(j + 1, u[i][j]));
                //populating the series with data
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
