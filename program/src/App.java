import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Pelanggan x = new Pelanggan();
        int id;
//        Data karyawan1;
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
                for (String b = "y"; b.equals("Y") || b.equals("y");) {
                    System.out.print("Masukkan ID Karyawan : ");
                    id = input.nextInt();
                    System.out.print("Masukkan nomor antrian pelanggan : ");
                    int kodeTransaksi = input.nextInt();
                    Data karyawan = new karyawan(id);
                    System.out.println(id + " ID karyawan terdaftar");
                    AmbilKodeTransaksi tr = new AmbilKodeTransaksi(kodeTransaksi);
                    System.out.print("Kode Transaksi pelnggan : "+tr.kodeTransaksi);
                    System.out.print("\nADA TAMBAHAN? (Y/T): ");
                    b = input.next();
                    System.out.println("------------------------------------------");
                }
            default:
                break;
        }

    }
}
