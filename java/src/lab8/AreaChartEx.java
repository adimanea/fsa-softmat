import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.AreaRendererEndType;
import org.jfree.chart.renderer.category.AreaRenderer;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.general.DatasetUtils;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

public class AreaChartEx extends JFrame {

    public AreaChartEx() {

        initUI();
    }

    private void initUI() {

        CategoryDataset dataset = createDataset();

        JFreeChart chart = createChart(dataset);
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        chartPanel.setBackground(Color.white);
        add(chartPanel);

        pack();
        setTitle("Area chart");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private CategoryDataset createDataset() {

        double[][] data = new double[][]{
                {82502, 84026, 85007, 86216, 85559, 84491, 87672,
                        88575, 89837, 90701}
        };

        CategoryDataset dataset = DatasetUtils.createCategoryDataset(
                new String[]{"Oil"}, new String[]{"2004", "2005", "2006",
                        "2007", "2008", "2009", "2010", "2011", "2012", "2013"},
                data
        );

        return dataset;
    }

    private JFreeChart createChart(CategoryDataset dataset) {

        JFreeChart chart = ChartFactory.createAreaChart(
                "Oil consumption",
                "Time",
                "Thousands bbl/day",
                dataset,
                PlotOrientation.VERTICAL,
                false,
                true,
                true
        );

        CategoryPlot plot = (CategoryPlot) chart.getPlot();
        plot.setForegroundAlpha(0.3f);

        AreaRenderer renderer = (AreaRenderer) plot.getRenderer();
        renderer.setEndType(AreaRendererEndType.LEVEL);

        chart.setTitle(new TextTitle("Oil consumption",
                new Font("Serif", java.awt.Font.BOLD, 18))
        );

        return chart;
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {

        	AreaChartEx ex = new AreaChartEx();
            ex.setVisible(true);
        });
    }
}
