public class StringCalculator
{
    public int add(String numbers)
    {
        if (numbers == "")
        {
            return 0;
        }
        String[] toAdd = numbers.split(",");

        int total = 0;

        for (int i = 0; i < (toAdd.length > 2 ? 2 : toAdd.length); i++)
        {
            total += Integer.parseInt(toAdd[i]);
        }
        return total;
    }
}
