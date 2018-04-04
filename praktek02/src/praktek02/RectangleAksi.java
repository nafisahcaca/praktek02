package praktek02;

public class RectangleAksi {
    public static void main(String[] args) {
        Rectangle rl = new Rectangle();
        rl.panjang = 9;
        rl.lebar = 3;
        
        rl.cetakInfo();
        System.out.println("luas rectangle ="+rl.hitungLuas());
        rl.cetakLuas();
        
        Rectangle r2 = new Rectangle();
        r2.cetakInfo();
        
        Rectangle r3 = new Rectangle();
        r3.cetakInfo();
        
    }
}
