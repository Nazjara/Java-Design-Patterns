package nazjara.auction;

import java.util.*;

public class AuctionMediatorImpl implements AuctionMediator {
    Map<Buyer, Double> buyers;
    String name;

    public AuctionMediatorImpl(String name) {
        this.buyers = new HashMap<>();
        this.name = name;
        System.out.println("Let's begin " + name + " auction");
    }

    @Override
    public void addBuyer(Buyer buyer) {
        buyers.put(buyer, 0.0);
        System.out.println("In auction " + this.name + " added new buyer - " + buyer.name);
    }

    @Override
    public void bid(Buyer buyer, double amount) {
        buyers.put(buyer, amount);
        System.out.println("Buyer " + buyer.name + " made a bet - " + amount);
    }

    @Override
    public void cancelBid(Buyer buyer) {
        buyers.remove(buyer);
        System.out.println("Buyer " + buyer.name + " canceled his(her) bet");
    }

    @Override
    public void determineWinner() {
        Buyer winner = Collections.max(buyers.entrySet(), Map.Entry.comparingByValue()).getKey();
        System.out.println("And the winner of " + this.name + " auction is " + winner.name + " with bet " + buyers.get(winner));
    }

    @Override
    public void notifyAboutEnding() {
        buyers.keySet().forEach(b -> b.hasEnded(this.name));
    }
}
