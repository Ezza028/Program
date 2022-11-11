import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Pelanggan x = new Pelanggan();
        Scanner input = new Scanner(System.in);
        boolean running = true;
        int counter = 0;
        int pilih;
        System.out.println("Pilih login sebagai");
        System.out.println("1.Pelanggan");
        System.out.println("2.Karyawan");
        System.out.print("pilih : ");
        pilih = input.nextInt();
        switch (pilih) {
            case 1:
                x.Menu();
                for (String b = "y"; b.equals("Y") || b.equals("y");) {
                    x.Hitung();
                    System.out.print("ADA TAMBAHAN? (Y/T): ");
                    b = input.next();
                    System.out.println("------------------------------------------");
                }
                x.Total();
                x.Pembayaran();
                break;

            case 2:
                x.Menu();
                for (String b = "y"; b.equals("Y") || b.equals("y");) {
                    x.Hitung();
                    System.out.print("ADA TAMBAHAN? (Y/T): ");
                    b = input.next();
                    System.out.println("------------------------------------------");
                }
                x.Total();
                x.Pembayaran();

            default:
                break;
        }

    }
}
