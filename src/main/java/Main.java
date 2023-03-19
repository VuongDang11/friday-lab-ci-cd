import objects.Dice;

public class Main
{
    public static void main(String[] args)
    {
        Dice dice = new Dice(2,"red");
        dice.roll();
        System.out.println(dice);
    }
}
