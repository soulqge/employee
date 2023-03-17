
package pegawai;

public class Manager extends Employee {
    String jabat = "manager";
    int gaji = 15_000_000;
    
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
