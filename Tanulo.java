import TanuloLetrehoz.szakEnum;
import TanuloLetrehoz.szakok;

public enum szakok{
    INFORMATIKA,MATEMATIKA,IRODALOM,FIZIKA,TORTENELEM
}

public class Tanulo {
    public static void main(String[] args) {
        TanuloLetrehoz ujTanulo = new TanuloLetrehoz("Kiss Janos", 0002);
        TanuloLetrehoz regiTanulo = new TanuloLetrehoz("Bukki Gergely", 0001);  

        regiTanulo.setAtlag(4.8);
        regiTanulo.setSzak(szakok.INFORMATIKA);

        regiTanulo.Megjelenit();
        ujTanulo.Megjelenit();
    }
}

class TanuloLetrehoz{
    private String nev;
    private int azonosito;
    private double atlag;
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

    public void setAtlag(double a){
        atlag = a;
    }

    public double getAtlag(){
        return atlag;
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
        System.out.println("Tanulo neve:"+ nev);
        System.out.println("Tanulo azonositoja:" + azonosito);
        System.out.println("Tanulo atlaga:" + atlag);
        System.out.println("Tanulo szakja:"+ szakString);
        System.out.println();
    }

}