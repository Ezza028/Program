import java.util.Scanner;

public class karyawan extends Data {
    private int ID;

    public karyawan(int ID){
        this.ID = ID;
    }

    @Override
    int getID(){
        return ID;
    }
}
