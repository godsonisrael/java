package great;


/**
 * Write a description of greatestTemp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.*;
import org.apache.commons.csv.*;
import java.io.*;

public class greatestTemp 
{
    public CSVRecord maxTemp(CSVParser parser)
    {
        CSVRecord L = null;
        for(CSVRecord CurrRow : parser)
        {
         if(L == null)
         {
             L = CurrRow ;
            }
            else
            {
                double CurrTemp = Double.parseDouble(CurrRow.get("TemperatureF"));
                double LargTemp = Double.parseDouble(L.get("TemperatureF"));
                if(CurrTemp > LargTemp)
                {
                    L = CurrRow;
                }
                
            }
        }
        return L;
    }
    public void Hottestday()
    {
        FileResource fr = new FileResource("data/2015/weather-2015-01-01.csv");
        CSVRecord Large = maxTemp(fr.getCSVParser());
        System.out.println("hottest temperature was" + Large.get("TemperatureF") + "at" + Large.get("TimeEST")); 
        }
    public CSVRecord manyHotDays()
    {
        CSVRecord L = null;
     DirectoryResource dr= new DirectoryResource();
     for (file f : dr.selectedFiles())
     {
         FileResource fr = new FileResource(f);
         CSVRecord current = ma
          
         }
    }

}
