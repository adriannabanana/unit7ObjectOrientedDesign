import java.util.Scanner;

public class FillInQuestion
{
    /* this class supports fill-in-the-blank questions where the answer is specified in the question's text
     * ex:
     *     test: "The inventor of Java was _James Gosling_."
     *     
     * this will extract the answer from the question's text and replace the answer w/ ____.
     */
    
    // we will override the setText method of the Question class to extract the answer from the text
    
    public void setText (String questionText)
    {
        Scanner parser = new Scanner(questionText);
        parser.useDelimiter=("_");
        String question = parser.next();
        String answer = parser.next();
        question += "_____" + parser.next();
        
        super.setText(question);

        this.setAnswer(answer);
        
    }
}
    