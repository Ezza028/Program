public abstract class Data {
    String nama;

    void setNama(String nama){
        this.nama = nama;
    }

    String getNama(){
        return this.nama;
    }

    abstract int getID();
}
