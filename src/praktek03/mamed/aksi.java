
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
        
        System.out.print("Jenisnya \t: ");
        System.out.println(s.getJenis_baju());
        System.out.print("Merknya \t: ");
        System.out.println(s.getMerk());
        System.out.print("Harganya \t: ");
        System.out.println(s.getHarga());
        
        bajumuslim sm = new bajumuslim();
        sm.setJenis_baju("Karet");
        sm.setMerk("Hitam");
        sm.setHarga(10000);
        sm.setBajumuslim("koko");
        sm.cetakInfo();
        System.out.println("Jenis \t:"+sm.getBajumuslim());
        sm.throttle();

    }
}
