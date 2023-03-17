package pegawai;

public class Boss extends Employee {
    String jabat = "boss";
    int gaji = 20_000_000;
    
    @Override
    int hitung(int gaji, int jamKerja){
        if (jamKerja >= 160) {
            jamKerja = 160;
        }
        int potongan =(super.jamKerja - jamKerja) * super.pot;
        int hasil = gaji - potongan;
        return hasil;
    }
 }
