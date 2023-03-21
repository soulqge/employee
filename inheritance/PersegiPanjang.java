package inheritance;

public class PersegiPanjang extends BangunDatar {
    
    float panjang;
    float lebar;
    
    @Override
     float luas(){
         float luas = panjang*lebar;
         System.out.println("Luas Persegi Panjang : "+luas);
         return luas;
     }
    
    @Override
    public float keliling(){
        float keliling = (2 * panjang + 2 * lebar);
        System.out.println("Keliling Persegi Panjang : "+keliling);
        return keliling;
    }
}
