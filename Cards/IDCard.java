
public class IDCard extends Card
{
    private String idNumber;
    public IDCard(String n, String id)
    {  
        super(n);
        idNumber = id;
    }
    
    public String setText()
    {
        String formattedDescription = format();
        formattedDescription += ("\nID Number: " + idNumber);
        return formattedDescription;
    }
    
    public boolean isExpired()
    {
        return false;
    }
}

    