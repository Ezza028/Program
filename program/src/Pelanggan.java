import java.util.Scanner;

public class Pelanggan extends App {
    Scanner in = new Scanner(System.in);
    Accesoris x = new Accesoris();
    float total1, total2, total3, total4, total5, total6, total7, total8, total9, total10, totalHarga;

    void Menu() {
        System.out.println("================ ACCESORIS ================");
        System.out.println("|    1.STOP LAMP        : RP.130.000      |");
        System.out.println("|    2.LAMPU SEN        : RP.30.000       |");
        System.out.println("|    3.SPION JALU       : RP.110.000      |");
        System.out.println("|    4.SIRIP HIU        : RP.60.000       |");
        System.out.println("|    5.LAMPU ALIS       : RP.250.000      |");
        System.out.println("|    6.KNALPOT          : RP.1.500.000    |");
        System.out.println("|    7.ROLER            : RP.300.000      |");
        System.out.println("|    8.KARBU            : RP.600.000      |");
        System.out.println("|    9.PISTON           : RP.450.000      |");
        System.out.println("|    10.BLOK MESIN      : RP.800.000      |");
        System.out.println("===========================================");
    }

    void Hitung() {
        System.out.print("INPUT  NO PESANAN         : ");
        int pesan = in.nextInt();
        System.out.print("INPUT JUMLAH YANG DIPESAN : ");
        float jumlah = in.nextInt();
        System.out.println("------------------------------------------");
        switch (pesan) {
            case 1:
                x.setStopLamp(jumlah * 130000);
                System.out.println("TOTAL HARGA : Rp." + x.getStopLamp());
                total1 = x.getStopLamp();
                break;
            case 2:
                x.setLampuSen(jumlah * 30000);
                System.out.println("TOTAL HARGA : Rp." + x.getLampuSen());
                total2 = x.getLampuSen();
                break;
            case 3:
                x.setSpionJalu(jumlah * 110000);
                System.out.println("TOTAL HARGA : Rp." + x.getSpionJalu());
                total3 = x.getSpionJalu();
                break;
            case 4:
                x.setSiripHiu(jumlah * 60000);
                System.out.println("TOTAL HARGA : Rp." + x.getSiripHiu());
                total4 = x.getSiripHiu();
                break;
            case 5:
                x.setlampuAlis(jumlah * 250000);
                System.out.println("TOTAL HARGA : Rp." + x.getLampuAlis());
                total5 = x.getLampuAlis();
                break;
            case 6:
                x.setKnalpot(jumlah * 1500000);
                System.out.println("TOTAL HARGA : Rp." + x.getKnalpot());
                total6 = x.getKnalpot();
                break;
            case 7:
                x.setRoler(jumlah * 300000);
                System.out.println("TOTAL HARGA : Rp." + x.getRoler());
                total7 = x.getRoler();
                break;
            case 8:
                x.setKarbu(jumlah * 600000);
                System.out.println("TOTAL HARGA : Rp." + x.getKarbu());
                total8 = x.getKarbu();
                break;
            case 9:
                x.setPiston(jumlah * 450000);
                System.out.println("TOTAL HARGA : Rp." + x.getPiston());
                total9 = x.getPiston();
                break;
            case 10:
                x.setBlokMesin(jumlah * 800000);
                System.out.println("TOTAL HARGA : Rp." + x.getBlokMesin());
                total10 = x.getBlokMesin();
                break;
            default:
                System.out.println("ANDA SALAH INPUTAN");
                break;
        }
    }

    void Total() {
        totalHarga = total1 + total2 + total3 + total4 + total5 + total6 + total7 + total8 + total9 + total10;
        System.out.println("TOTAL SELURUH HARGA : Rp." + totalHarga);
    }

    void Pembayaran() {
        System.out.println("------------------------------------------");
        System.out.print("TUNAI PEMBELI : Rp.");
        float tunai = in.nextFloat();
        float kembali = tunai - totalHarga;
        if (kembali > totalHarga) {
            System.out.println("KEMBALI       : Rp." + kembali);
            System.out.println("-----THANKS FOR BUYIING-----");
        } else if (kembali == 0) {
            System.out.println("KEMBALI       : TUNAI PAS");
            System.out.println("-----THANKS FOR BUYIING-----");
        } else {
            System.out.println("KEMBALI       : TUNAI KURANG Rp" + kembali);
            System.out.println("-----THANKS FOR BUYIING-----");
        }

    }
}
