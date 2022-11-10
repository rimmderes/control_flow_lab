import java.util.Scanner;

public class ClothingWeathing {
    public static void main(String[] args) {

        boolean rainy = true;
        boolean sunny = true;

        System.out.println("What is the weather like?");

        Scanner reader = new Scanner(System.in);
        int temperature = reader.nextInt();
        String weather = reader.nextLine();

        System.out.println("The weather is " + temperature + weather);


        if(temperature > 16) {
            System.out.println("Wear light clothes");
        } else if (temperature < 16) {
            System.out.println("Wear a jumper");
        }  if(weather == "rainy") {
            System.out.println("Wear a raincoat and take an umbrella");
        } else if(weather == "sunny"); {
            System.out.println("Wear lighter clothes");
        } if(temperature > 16 && weather == "rainy") {
            System.out.println("Dress lighter and take an umbrella");
        } else if(temperature < 16 && weather == "sunny"); {
            System.out.println("Dress warm");
        }  if(temperature > 16 || weather == "sunny"); {
            System.out.println("Wear sunscreen");
        } if (temperature < 16 || weather == "rainy"); {
            System.out.println("Wear a coat");
        } if(temperature == 7 && weather == "sunny") {
            System.out.println("Wear a hat");
        }

    }
}
