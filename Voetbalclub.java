package practicum.week_twee;

public class Voetbalclub {
    private String naam;
    private int aantalGewonnen;
    private int aantalGelijk;
    private int aantalVerloren;
    private int aantalGespeeld;
    private int aantalPunten;


    public Voetbalclub(){
        this.naam="Fc";
    }


    public Voetbalclub(String naam){
        this.naam=naam;
    }


public String getNaam(){
        return this.naam;
}


    public int aantalGespeeld(){
        return aantalGespeeld;

    }




    public void verwerkResultaat(char ch) {
        if (ch == 'w'){
            System.out.println("w");
            aantalGewonnen = aantalGewonnen + 1;
            aantalPunten=aantalPunten+3;}
        if (ch == 'g'){
            System.out.println("g");
            aantalGelijk = aantalGelijk + 1;
            aantalPunten=aantalPunten+1;}
        if (ch == 'v'){
            System.out.println("v");
            aantalVerloren = aantalVerloren + 1;}
        aantalGespeeld=aantalGespeeld+1;

    }
    public int aantalPunten(){
        return aantalPunten;
    }

    @Override
    public String toString() {
        return naam+" "+aantalGespeeld+" "+aantalGewonnen+" "+aantalGelijk+" "+aantalVerloren+" "+aantalPunten;
    }

}
