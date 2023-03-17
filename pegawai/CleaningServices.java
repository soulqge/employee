
package pegawai;

public class CleaningServices extends Employee {
    
    String jabat = "Cleaning Services";
    int gaji = 8_500_000;
    
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
