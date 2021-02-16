

public class Voetbalclub {
    private String naam;
    private int aantalGewonnen;
    private int aantalGelijk;
    private int aantalVerloren;
    private int aantalGespeeld;
    private int aantalPunten;

    public Voetbalclub(String naam){
        this.naam=naam;
    }





    public int aantalGespeeld(){
        return aantalGespeeld;

    }




    public void verwerkResultaat(char ch) {
        if (ch == 'w')
            aantalGewonnen = aantalGewonnen + 1;
            aantalPunten=aantalPunten+3;
        if (ch == 'g')
            aantalGelijk = aantalGelijk + 1;
            aantalPunten=aantalPunten+1;
        if (ch == 'v')
            aantalVerloren = aantalVerloren + 1;
        aantalGespeeld=aantalGespeeld+1;
        //System.out.println(aantalPunten);
    }
    public int aantalPunten(){
        return aantalPunten;
    }

    @Override
    public String toString() {
        return naam+" "+aantalGespeeld+" "+aantalGewonnen+" "+aantalGelijk+" "+aantalVerloren+" "+aantalPunten;
    }

}
