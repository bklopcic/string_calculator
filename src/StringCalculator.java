public class StringCalculator
{
    public int add(String numbers)
    {
        if (numbers.equals(""))
        {
            return 0;
        }
        numbers = numbers.replace("\n", ",");//This makes sense
        String[] toAdd = numbers.split(",");

        int total = 0;

        for (int i = 0; i < toAdd.length; i++)
        {
            total += Integer.parseInt(toAdd[i]);//looks good
        }
        return total;
    }
}
