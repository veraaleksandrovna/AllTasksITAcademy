package by.academy.ships;

public class Ship {

    private String name;
    private int deckAmount;
    Decks [] decks = new Decks[deckAmount];

    public Ship(int deckAmount, String name){
        if(deckAmount==1||deckAmount==2){
            decks = new Decks[deckAmount];
            this.name=name;
        }
    }

    public boolean setDeck (Decks Deck ){
        if(decks.length==deckAmount|| decks[deckAmount]!=null)
            return false;
        decks[deckAmount++]=Deck;
        return true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
