import java.util.Scanner;
public class Intro {
    Scanner scan = new Scanner(System.in);
    //Show directions
    public void welcome() {
        System.out.println("Welcome to the lemonade stand! The directions are...");
    }
    //enter name
    //choose number of days
    public int days() {
        System.out.println("Enter name: ");
        String name = scan.nextLine();
        System.out.println(name + ", enter the days you would like to play (7, 14, or 30): ");
        int daysToPlay = scan.nextInt();
        return daysToPlay;
    }

    
}
