public class Knjiga {

    private String naslov;
    private String autor;
    private int godinaIzdanja;
    private boolean dostupnost;

    //Konstruktor za slučaj da se ništa ne unese
    public Knjiga(){
        this.naslov = "";
        this.autor = "";
        this.godinaIzdanja = 0;
        this.dostupnost = false;
    }

    //Konstruktor za legitiman slučaj
    public Knjiga(String ime, String pisac, int godina, boolean dostupnost){
        this.naslov = pisac;
        this.autor = ime;
        this.godinaIzdanja = godina;
        this.dostupnost = dostupnost;
    }

    //Metoda za promjenu statusa dostupnosti

    public void postaviDostupnost(boolean promjena){
        if (dostupnost == promjena){

        } else{
        this.dostupnost = promjena;
        }

    }

    //Metoda za ispis informacija o knjizi

    public void ispisKnjige(){

        if (this.dostupnost== true){
            String imalJe = "Dostupna!";
            System.out.println(naslov + autor + godinaIzdanja + imalJe);
        }else {
            String imalJe = "Nije dostupna!";
            System.out.println(naslov + autor + godinaIzdanja + imalJe);
        }
    }


    @Override

    public String toString(){
        return naslov + " " + autor  + " " + godinaIzdanja;
    }












}
