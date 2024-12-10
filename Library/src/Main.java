public class Main {
    public static void main(String[] args) {

        Biblioteka graska = new Biblioteka();
        Biblioteka ilidžanskaBolja = new Biblioteka();

        Knjiga k1 = new Knjiga("Mistična putovanja", "Jin Lin", 2001, true);
        Knjiga k2 = new Knjiga("Proza u djelu", "Gasko Miki", 2004, true);
        Knjiga k3 = new Knjiga("Prokleto je nebo", "Sandra Šanz", 2012, true);
        Knjiga k4 = new Knjiga("Je l' Jelah gdje je nekad bio", "Meša Selimovski", 1922, true);

        Clan c1 = new Clan("Amina", "Dostojevski");
        Clan c2 = new Clan("Ivan", "Andrić");
        Clan c3 = new Clan("Nurka", "Šipak");
        Clan c4 = new Clan("Šaban", "Altrulović");


        graska.dodajKnjigu(k1);
        graska.dodajKnjigu(k2);
        ilidžanskaBolja.dodajKnjigu(k3);
        ilidžanskaBolja.dodajKnjigu(k4);

        c1.dodajKnjigu(k1);
        c2.dodajKnjigu(k2);
        c3.dodajKnjigu(k3);
        c4.dodajKnjigu(k4);

        graska.ispisSvihKnjiga();




    }
}