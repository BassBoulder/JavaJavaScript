import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
       return new HashSet<>(cards);
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        boolean TradeBool = false;

        for (String theirCard : theirCollection){
            for (String myCard : myCollection){
                if (!myCollection.contains(theirCard) && !theirCollection.contains(myCard)){
                    TradeBool = true;
                    break;
                }
            }
        }
        return TradeBool && !myCollection.isEmpty() && !theirCollection.isEmpty();
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        Set<String> commonCardsSet = new HashSet();

        if (!collections.isEmpty()){
            Iterator<Set<String>> collectionsIterator = collections.iterator();
            commonCardsSet.addAll(collectionsIterator.next());

            while (collectionsIterator.hasNext()){
                commonCardsSet.retainAll(collectionsIterator.next());
            }
        }
        return commonCardsSet;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> allCardsSet = new HashSet();
        
        for ( Set<String> collection : collections){
            allCardsSet.addAll(collection);
        }
        return allCardsSet;
    }
}
