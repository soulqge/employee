
package pegawai;

   public class Internship extends Employee {
    
     String jabat = "Intern";
    int gaji = 5_000_000;
    
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

