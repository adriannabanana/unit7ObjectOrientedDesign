public class Billfold
{
    private Card card1;
    private Card card2;
    
    public Billfold(Card card1, Card card2)
    {
        this.card1 = card1;
        this.card2 = card2;
    }
    
    public void addCard(Card card)
    {
        if (this.card1 != null)
        {
            card = card1;
        }
        else if (this.card2 != null)
        {
            card = card2;
        }
    }
    
    public String formatCards()
    {
        if (this.card1 == null && this.card2 == null)
        {
            return "";
        }
        
        String formatted = "[";
        if (this.card1 != null && this.card2 != null)
        {
            formatted += (this.card1 + "|" + this.card2);
        }
        else if (this.card1 != null)
        {
            formatted += this.card1;
        }
        else
        {
            formatted += this.card2;
        }
        
        formatted += "]";
        return formatted;
    }
    
    public int getExpiredCardCount()
    {
        int expiredCount = 0;
        if (this.card1.isExpired())
        {
            expiredCount++;
        }
        else if (this.card2.isExpired())
        {
            expiredCount++;
        }
        return expiredCount;
    }
}