import pacotes.pacote.*;
import java.util.Scanner;
class Main {
    protected static boolean running = true;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type help to see available commands");
        while (running) {
            String newComand = scanner.next();
            switch (newComand) {
                case "help":
                    help();
                    break;
                case "exit":
                    exit();
                    break;
                default:
                    System.out.println("Type help ");
                    break;
            }
        }
        scanner.close();
        return;
    }
    public static void help() {
        System.out.println("Available commands:\n\'exit\'\n");
    }
    public static void exit() {
        running = false;
        System.out.println("Exiting...");
    }
}