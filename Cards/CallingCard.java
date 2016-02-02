public class CallingCard extends Card
{
    private String pinNum;
    public CallingCard(String number, String pin)
    {
        super(number);
        pinNum = pin;
    }
    
    public String setText()
    {
        String formattedDescription = format();
        formattedDescription += ("\nPin Number: " + pinNum);
        return formattedDescription;
    }
    
    public boolean isExpired()
    {
        return false;
    }
}