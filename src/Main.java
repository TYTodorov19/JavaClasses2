import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Animal dog = new Animal("Dog", 20);
        Animal cat = new Animal("Cat", 10);

        System.out.println(dog.getAge());
        System.out.println(cat.getAge());

        dog.setAge(21);
        cat.setAge(11);
        System.out.println(dog.getAge());
        System.out.println(cat.getAge());
         */

        Scanner scanner = new Scanner(System.in);
        List<Person> people = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        for(int i = 0; i < n; i++)
        {
            String[] input = scanner.nextLine().split("\\s+");
            String Name = input[0];
            int Age = Integer.parseInt(input[1]);
            Person person = new Person(Name,Age);
            people.add(person);
        }

        for(int i = 0; i < people.size();i++) {
            if (people.get(i).getAge() >= 30) {
                System.out.println(people.get(i));
            }
        }
        for(Person per : people){
            System.out.println(per);
        }
    }
}
