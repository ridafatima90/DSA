package books.joshuabloch.objects.generalprogramming;

import javax.lang.model.element.Element;
import java.util.*;

public class Practise {
        enum Suit { CLUB, DIAMOND, HEART, SPADE }
        enum Rank { ACE, DEUCE, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT,
            NINE, TEN, JACK, QUEEN, KING }
    static Collection<Suit> suits = Arrays.asList(Suit.values());
    static Collection<Rank> ranks = Arrays.asList(Rank.values());
    public static void main(String[] args) {

//        List<Card> deck = new ArrayList<>();
//        for (Iterator<Suit> i = suits.iterator(); i.hasNext(); )
//            for (Iterator<Rank> j = ranks.iterator(); j.hasNext(); )
//                deck.add(new Card(i.next(), j.next()));

    }
}
