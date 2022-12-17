public class AmbilKodeTransaksi implements TransaksiCode{
    int kodeTransaksi;

    public AmbilKodeTransaksi(int kodeTransaksi) {
        this.kodeTransaksi = kodeTransaksi;
    }

    @Override
    public int getTransaksiCode() {
        return kodeTransaksi*2-3+1-2;
    }
}
