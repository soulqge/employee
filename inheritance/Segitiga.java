package inheritance;

public class Segitiga extends BangunDatar {
    
    float alas;
    float tinggi;
    float sisimiring;
    
    @Override
    public float luas(){
        float luas = ((alas * tinggi)/2);
        System.out.println("Luas Segitiga : "+luas);
        return luas;
    }
    
    @Override
    public float keliling(){
         float keliling = (2 * sisimiring ) + alas;
        System.out.println("Keliling Segitiga: " + keliling );
        return keliling;
    }
   
    
}
