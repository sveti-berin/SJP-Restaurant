import java.util.ArrayList;

public class Clan {

    private String ime;
    private String prezime;
    private ArrayList<Knjiga> posuđeneknjige;

    //Konstruktor za psotavljanje imena i prezimena člana

    public Clan(String ime, String prezime){
        this.ime = ime;
        this.prezime = prezime;
        posuđeneknjige = new ArrayList<>();
    }


    //Metoda za dodavanje knjige u listu posuđenih knjiga

    public void dodajKnjigu(Knjiga knjiga){
        posuđeneknjige.add(knjiga);
        knjiga.postaviDostupnost(false);
        System.out.println("Član " + ime + prezime + " je iznajmio knjigu " + knjiga);

    }

    //metoda za vraćanje knjige

    public void ukloniKnjigu(Knjiga knjiga){
        posuđeneknjige.remove(knjiga);
        knjiga.postaviDostupnost(true);
        System.out.println("Član " + ime + prezime + " je vratio knjigu " + knjiga);
    }

    //metoda za ispis informacija o članu i njegovim posuđenim knjigama

    public void ispisInformacija(){
        if (posuđeneknjige.isEmpty()){
            System.out.println("Član nema posuđenih knjiga");
        }
        else{
            System.out.println("Član " + ime + " ima posuđene sljedeće knjige: \n");
            for(Knjiga kn : posuđeneknjige){
                System.out.println("- " + kn);
            }

        }


    }









}
