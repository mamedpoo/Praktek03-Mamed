
package praktek03.mamed;
public class baju {
   private String jenis_baju;
   private String merk;
   private double harga;
    
    void cetakInfo(){
    System.out.println("Jenis Baju \t:" + jenis_baju+"\n"+
                "Merk \t:"+merk+"\n"+
                "Harga \t:"+harga);
    
    }

    public String getJenis_baju() {
        return jenis_baju;
    }

    public void setJenis_baju(String jenis_baju) {
        this.jenis_baju = jenis_baju;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
    
    
    
    
}
