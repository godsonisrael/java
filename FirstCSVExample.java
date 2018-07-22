package csvfile;

import edu.duke.*;
import org.apache.commons.csv.*;

public class FirstCSVExample
{
    public void readFood()
    {
        FileResource fr = new FileResource();
        CSVParser pr = fr.getCSVParser();
        for(CSVRecord rec : pr)
        {
            System.out.print(rec.get("Name" + ""));
            System.out.println(rec.get("Favorite Food"));
        }
    }

}
