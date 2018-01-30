public class StringCalculator
{
    public int add(String numbers)
    {
        if (numbers == "")
        {
            return 0;
        }

        return Integer.parseInt(numbers);
    }
}
