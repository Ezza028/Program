import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Pelanggan x = new Pelanggan();
        Scanner input = new Scanner(System.in);
        boolean running = true;
        int counter = 0;
        x.Menu();
        for (String b = "y"; b.equals("Y") || b.equals("y");) {
            x.Hitung();
            System.out.print("ADA TAMBAHAN? (Y/T): ");
            b = input.next();
            System.out.println("------------------------------------------");
        }
        x.Total();
        x.Pembayaran();
    }
}
