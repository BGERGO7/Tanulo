import TanuloLetrehoz.szakEnum;
import TanuloLetrehoz.szakok;

public enum szakok{
    INFORMATIKA,MATEMATIKA,IRODALOM,FIZIKA,TORTENELEM
}

public class Tanulo {
    public static void main(String[] args) {
        TanuloLetrehoz ujTanulo = new TanuloLetrehoz("Kiss Janos", 0002);
        TanuloLetrehoz regiTanulo = new TanuloLetrehoz("Bukki Gergely", 0001);  

        regiTanulo.setJegyek(4.9, 4.7, 4.3, 4.5, 4.0);
        regiTanulo.setSzak(szakok.INFORMATIKA);

        ujTanulo.setSzak(szakok.MATEMATIKA);
        ujTanulo.setJegyek(4.1, 5.0, 3.9, 4.0, 3.5);

        regiTanulo.Megjelenit();
        ujTanulo.Megjelenit();
    }
}

class TanuloLetrehoz{
    private String nev;
    private int azonosito;
    private double[] jegyek = new double[5];
    private double atlag = 0.0;
    private String szakString;

    public void setNev(String nev){
        this.nev = nev;
    }

    public String getNev() {
        return nev;
    }

    public void setAzonosito(int azonosito){
        this.azonosito = azonosito;
    }

    public int getAzonosito(){
        return azonosito;
    }

    public void setJegyek(double elso, double masodik, double harmadik, double negyedik, double otodik){
        jegyek[0] = elso;
        jegyek[1] = masodik;
        jegyek[2] = harmadik;
        jegyek[3] = negyedik;
        jegyek[4] = otodik;

    }

    public double getAtlag(){
        int index = 0;
        
        for (double x : jegyek){
            atlag += x;
            index++;
        }

        return atlag / index;
    }

    public void setSzak(szakok szak){
        if(szak == szakok.INFORMATIKA){
            szakString = "INFORMATIKA";   
        }else if(szak == szakok.MATEMATIKA){
            szakString = "MATEMATIKA";   
        }else if(szak == szakok.IRODALOM){
            szakString = "IRODALOM";   ;
        }else if(szak == szakok.FIZIKA){
            szakString = "FIZIKA";   
        }else if(szak == szakok.TORTENELEM){
            szakString = "TORTENELEM";   
        }
    }

    public String getSzak(){
        return szakString;
    }

    public TanuloLetrehoz(){
        nev = "";
        azonosito = 0;
    }

    public TanuloLetrehoz(String nev){
        this.nev = nev;
        azonosito = 0;
    }

    public TanuloLetrehoz(int azonosito){
        nev = "";
        this.azonosito = azonosito;
    }

    public TanuloLetrehoz(String nev, int azonosito){
        this.nev = nev;
        this.azonosito = azonosito;
    }

    public void Megjelenit(){
        System.out.println("Tanulo neve:"+ getNev());
        System.out.println("Tanulo azonositoja:" + getAzonosito());
        System.out.println("Tanulo atlaga:" + getAtlag());
        System.out.println("Tanulo szakja:"+ getSzak());
        System.out.println();
    }

}