import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);

         


        cars.add("Gofl");
        cars.add("Opala");
        cars.add("Jetta");
        cars.add("Fusca");
        cars.add("Celta");

        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }

        cars.remove(3);
        cars.remove(1);

        System.out.println(cars.size());
        

        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
    }
}
