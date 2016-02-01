public class DriverLicense extends Card
{
    private String exYear;
    public DriverLicense(String expirationYear)
    {
        exYear = expirationYear;
    }
    
    public String setText()
    {
        String formattedDescription = format();
        formattedDescription += ("\nExpiration Year: " + exYear);
        return formattedDescription;
    }
}