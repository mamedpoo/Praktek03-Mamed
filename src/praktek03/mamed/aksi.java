
package praktek03.mamed;

public class aksi {
    public static void main(String[] args) {
        baju s = new baju();
        s.jenis_baju="Kaos";
        s.merk="Owners";
        s.harga=10000;
        
        s.setJenis_baju("Jeans");
        s.setMerk("Merah");
        s.setHarga(1000);
         
        s.cetakInfo();
    }
}
