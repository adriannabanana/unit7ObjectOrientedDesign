import java.util.Calendar;
import java.util.GregorianCalendar;

public class DriverLicense extends Card
{
    
    private int exYear;
    public DriverLicense(int expirationYear)
    {
        exYear = expirationYear;
    }
    
    public boolean isExpired()
    {
        GregorianCalendar calendar = new GregorianCalendar();
        
        if (calendar.get(Calendar.YEAR) >= this.exYear)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
   
    
    public String setText()
    {
        String formattedDescription = format();
        //formattedDescription += ("\nExpiration Year: " + exYear);
        //return formattedDescription;
        return super.format() + ", Expiration year " + this.exYear;
    }
    
    
}