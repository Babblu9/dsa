import  java.util.Scanner;
public class DynamicInputExample{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Hello" + name + ",your are " + age + "years old.");
        scanner.close();
        
    }
}
