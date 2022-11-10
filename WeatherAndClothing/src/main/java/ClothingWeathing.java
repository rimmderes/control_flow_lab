import java.util.Scanner;

public class ClothingWeathing {
    public static void main(String[] args) {

        System.out.println("What is the weather like?");

        Scanner reader = new Scanner(System.in);
        int temperature = reader.nextLine();

        System.out.println("The weather in degrees celsius is ?" + temperature);


        if(temperature = 16) {
            System.out.println("Wear light clothes");
        } if (temperature < 16) {
            System.out.println("Wear a jumper");
        }
        // huiwheiu
    }
}
