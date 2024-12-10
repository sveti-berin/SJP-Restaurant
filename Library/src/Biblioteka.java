import java.lang.reflect.Array;
import java.util.ArrayList;

public class Biblioteka {

    private ArrayList<Clan> clanovi;
    private ArrayList<Knjiga> knjige;

    //Konstruktor koji prave prazne liste

    public Biblioteka() {
        clanovi = new ArrayList<>();
        knjige = new ArrayList<>();
    }

    //metoda za dodavanje nove knjige u biblioteku

    public void dodajKnjigu(Knjiga kn){
        knjige.add(kn);
        System.out.println("Dodana je knjiga: " + kn.toString());
    }

    //metoda za dodavanje novog clana posade
    public void dodajClana(Clan c){
        clanovi.add(c);
        System.out.println("Dodan je član: " + c.toString());
    }


    //metoda za ispis svih knjiga i njihove dostupnosti

    public void ispisSvihKnjiga(){
        if(knjige.isEmpty()){
            System.out.println("Nema knjiga, prazno sve jarane!");
        }else  {
            System.out.println("Biblioteka raspolaže sa ovim knjigama: \n");
            for (Knjiga k : knjige){
                k.ispisKnjige();
            }
        }


    }

    //metoda za ispis svih članova i posuđenih knjiga

    public void ispisSvihClanova(){
        if(clanovi.isEmpty()){
            System.out.println("Nema članova, neće da čitaju!");
        }else{
            System.out.println("Ovo su članovi biblioteke: \n");
            for (Clan c : clanovi){
                c.ispisInformacija();
            }
        }

    }








}
