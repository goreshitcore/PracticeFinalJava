import java.util.Scanner;

public class Americaya {

public static void main(String[] args) {
System.out.println("america ya ^.^");
Scanner userInputReader = new Scanner(System.in);
String userInput;

while (true) {
userInput = userInputReader.nextLine();

if (userInput.equals("hello")) {
while (true) {
System.out.println("hello >.<");
}
}
else if (userInput.equals("no")) {
System.out.println("ur so dissapointing");
}
else {
return;
}
}
}
}