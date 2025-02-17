public abstract class Tanaman {
    
    private int masaHidup;
    private int lamaHidup;
    private int berbuah;
    private int buah;
    private double perkembangan;
    private double prosesBerbuah;

    
    public Tanaman(int masaHidup,int lamaHidup,double perkembangan) {
        
    }


    public int getMasaHidup() {
        return masaHidup;
    }
    public void setMasaHidup(int masaHidup) {
        this.masaHidup = masaHidup;
    }

    public int getLamaHidup() {
        return lamaHidup;
    }
    public void setLamaHidup(int lamaHidup) {
        this.lamaHidup = lamaHidup;
    }

    public int getBerbuah() {
        return berbuah;
    }
    public void setBerbuah(int berbuah) {
        this.berbuah = berbuah;
    }    
    
    public int getBuah() {
        return buah;
    }
    public void setBuah(int buah) {
        this.buah = buah;
    }

    public double getPerkembangan() {
        return perkembangan;
    }
    public void setPerkembangan(double perkembangan) {
        this.perkembangan = perkembangan;
    }

    public double getProsesBerbuah() {
        return prosesBerbuah;
    }
    public void setProsesBerbuah(double prosesBerbuah) {
        this.prosesBerbuah = prosesBerbuah;
    }


    public abstract void berkembang(){

    }
    public String Status(){
        if (lamaHidup >= masaHidup) {
          System.out.println("Mati");  
        }else {
            System.out.println("Hidup");
        }

    }
    public String toString(){
        System.out.println("Masa Hidup " + getMasaHidup() + " hari"); 
        System.out.println("Berbuah sebanyak " + getBerbuah());
        System.out.println("Dengan perkembangan sebanyak " + getPerkembangan() + " %");
    }
}
