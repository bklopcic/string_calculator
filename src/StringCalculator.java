public class StringCalculator
{
    public int add(String numbers)
    {
        if (numbers.equals(""))
        {
            return 0;
        }
        //numbers = numbers.replace("\n", ",");//This makes
        System.out.println("This dont work");
        String[] toAdd = numbers.split("[/ \n\t\r.,;:!?(){]");

        int total = 0;

        for (int i = 0; i < toAdd.length; i++)
        {
            total += Integer.parseInt(toAdd[i]);//looks good
        }
        return total;
    }
}
