public class StringCalculator
{
    public int add(String numbers)
    {
        //check for empty string
        if (numbers.equals(""))
        {
            return 0;
        }
        numbers  = numbers.replaceAll("[^0-9-,]", ",");
        String[] toAdd = numbers.split(",");

        int total = 0;

        for (int i = 0; i < toAdd.length; i++)
        {
            total += Integer.parseInt(toAdd[i]);//looks good
        }
        return total;
    }
}
