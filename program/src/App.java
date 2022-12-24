import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Pelanggan x = new Pelanggan();
        Scanner input = new Scanner(System.in);
        boolean running = true;
        int counter = 0;

        do
        {
            System.out.println("Pilih login sebagai");
            System.out.println("1.Pelanggan");
            System.out.println("2.Karyawan");
            System.out.print("pilih : ");
            int pilih = input.nextInt();

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

                    System.out.println("1. INPUT ID KARYAWAN");
                    System.out.println("2. CEK ID KARYAWAN");
                    System.out.print("PILIH MENU : ");
                    int pilih1 = input.nextInt();

                    if(pilih1 == 1){
                        for (String b = "y"; b.equals("Y") || b.equals("y");) {
                            System.out.print("Masukkan ID Karyawan : ");
                            int idKaryawan = input.nextInt();
                            try
                            {
                                FileWriter tulis = new FileWriter("src/idKaryawan.txt",true);
                                tulis.write(idKaryawan + "\n");
                                tulis.close();
                                Data karyawan = new karyawan(idKaryawan);
                            } catch (Exception exception) {
                                System.out.println("Error inputan");
                            }
                            System.out.print("Masukkan nomor antrian pelanggan : ");
                            int kodeTransaksi = input.nextInt();
                            System.out.println(idKaryawan + " ID karyawan terdaftar");
                            AmbilKodeTransaksi tr = new AmbilKodeTransaksi(kodeTransaksi);
                            System.out.print("Kode Transaksi pelnggan : "+tr.getTransaksiCode());
                            System.out.print("\nADA TAMBAHAN? (Y/T): ");
                            b = input.next();
                            System.out.println("Data Berhasil Masuk");
                            System.out.println("------------------------------------------");
                        }
                    }else {
                        File bacaF = new File("src/idKaryawan.txt");
                        Scanner baca = new Scanner(bacaF);
                        int idKaryawan[] = new int[20];
                        int index = 0;
                        while (baca.hasNextInt()) {
                            idKaryawan[index++] = baca.nextInt();
                        }
                        System.out.println("ID Customer Terdaftar");
                        for (int i = 0; i < index; i++) {
                            System.out.println(idKaryawan[i]);
                        }

                    }

                default:
                    break;
            }


        }while (running == true);


    }
}
