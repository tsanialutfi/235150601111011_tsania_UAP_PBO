public class Stroberi extends Tanaman{
    public Stroberi(int masaHidup,int berbuah, double perkembangan){
        super(masaHidup, berbuah, perkembangan);
        this.setMasaHidup(60);
        this.setBerbuah(150);
        this.setPerkembangan(25);
    }

   

    @Override
    public String Status() {
        // TODO Auto-generated method stub
        return super.Status();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

    @Override
    public void berkembang() {
        // TODO Auto-generated method stub
        
    }
}
