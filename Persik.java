public class Persik extends Tanaman {
    public Persik(int masaHidup,int berbuah,double perkembangan){
        super(masaHidup, berbuah, perkembangan);
        this.setMasaHidup(180);
        this.setBerbuah(150);
        this.setPerkembangan(15);
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
