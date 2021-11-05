import java.util.Scanner;

public class ParrotSalute {
    public static void main(String[] args) throws Exception {

        Scanner keyboard = new Scanner(System.in);
        int groupSize = 0;

        do {
            System.out.print("What is the size of your group: ");
            groupSize = keyboard.nextInt();
        } while(groupSize<=0 || groupSize >= 11);

        String salute = "";
        for(int i=0; i<groupSize; i++){
            salute += "Hi!"; // salute = salute + "Hi!";
            salute += "-";
        }

        System.out.println(salute);
        keyboard.close();

    }
}
