/*The following example depicts various car statistics with the help of a bar chart. Following is a list of car brands along with their different 
 * characteristics, which we will show using a bar chart −
 * Car  Speed UserRating Millage Safety
 * Fiat 1.0   3.0        5.0     5.0 
 * Audi 5.0   6.0        10.0    4.0 
 * Ford 4.0   2.0        3.0     6.0 
 * Following is the code to create a Bar Chart from the above given information. This code helps you to embed a bar chart in any AWT based 
 * application.
 */

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel; 
import org.jfree.chart.JFreeChart; 
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset; 
import org.jfree.data.category.DefaultCategoryDataset; 
import org.jfree.chart.ui.ApplicationFrame; 
//import org.jfree.ui.RefineryUtilities; 

public class BarChart_AWT extends ApplicationFrame {
   
   public BarChart_AWT( String applicationTitle , String chartTitle ) {
      super( applicationTitle );        
      JFreeChart barChart = ChartFactory.createBarChart(chartTitle, "Category",            
         "Score",            
         createDataset(),          
         PlotOrientation.VERTICAL,           
         true, true, false);
         
      ChartPanel chartPanel = new ChartPanel( barChart );        
      chartPanel.setPreferredSize(new java.awt.Dimension( 560 , 367 ) );        
      setContentPane( chartPanel ); 
   }
   
   private CategoryDataset createDataset( ) {
      final String fiat = "FIAT";        
      final String audi = "AUDI";        
      final String ford = "FORD";        
      final String speed = "Speed";        
      final String millage = "Millage";        
      final String userrating = "User Rating";        
      final String safety = "safety";        
      final DefaultCategoryDataset dataset = new DefaultCategoryDataset( );  

      dataset.addValue( 1.0 , fiat , speed );        
      dataset.addValue( 3.0 , fiat , userrating );        
      dataset.addValue( 5.0 , fiat , millage ); 
      dataset.addValue( 5.0 , fiat , safety );           

      dataset.addValue( 5.0 , audi , speed );        
      dataset.addValue( 6.0 , audi , userrating );       
      dataset.addValue( 10.0 , audi , millage );        
      dataset.addValue( 4.0 , audi , safety );

      dataset.addValue( 4.0 , ford , speed );        
      dataset.addValue( 2.0 , ford , userrating );        
      dataset.addValue( 3.0 , ford , millage );        
      dataset.addValue( 6.0 , ford , safety );               

      return dataset; 
   }
   
   public static void main( String[ ] args ) {
      BarChart_AWT chart = new BarChart_AWT("Car Usage Statistics", "Which car do you like?");
      chart.pack( );        
 //     RefineryUtilities.centerFrameOnScreen( chart );        
      chart.setVisible( true ); 
   }
}