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
    
    // override the equals method defined in Card as well as Object
    public boolean equals(Object other)
    {
        // check if this object and the other object are both of the same class
        if (this.getClass() == other.getClass())
        {
            // first check if this object and the other object are equal from the  
            // perspectiveof the superclass (i.e., Card)
            boolean isEqual = super.equals(other);
            
            // second, cast the other object to an IDCard and check if idNumbers are equal
            IDCard otherIDCard = (IDCard) other;
            return isEqual && this.idNumber.equals(otherIDCard.idNumber);
        }
        
        return false;
    }
}