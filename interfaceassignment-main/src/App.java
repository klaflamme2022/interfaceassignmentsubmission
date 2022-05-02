import java.util.Scanner;
// Jr dev
public class App {
    public static void main(String[] args) {
            // object creation
            Scanner scan = new Scanner(System.in);
            Rectangle rectangle = new Rectangle();

            rectangle.draw();

            String cmd = scan.nextLine();
            if(cmd.equals("1")) {
                System.out.println("Drawing a rectangle....");

            }
            else{
                System.out.println("Command not found");
                System.out.println("Closing this app..");
            }

        }
}
