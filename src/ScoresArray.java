import java.util.Scanner;
import java.util.Arrays;
public class ScoresArray
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int [] scores ={85,92,78,96,88};
        int max = Arrays.stream(scores).max().getAsInt();
        int sum = Arrays.stream(scores).sum();
        double average = Arrays.stream(scores).average().getAsDouble();
        System.out.println("Max num is : "+max);
        System.out.println("Sum is : "+sum);
        System.out.println("Average num is : "+average);

    }
}
