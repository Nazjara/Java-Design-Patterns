package nazjara.auction;

import java.util.Objects;

public abstract class Buyer {

    protected String name;
    protected AuctionMediator auctionMediator;

    public Buyer(String name, AuctionMediator auctionMediator) {
        this.name = name;
        this.auctionMediator = auctionMediator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Buyer buyer = (Buyer) o;
        return name.equals(buyer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    abstract void bid(double amount);
    abstract void cancelBid();
    abstract void hasEnded(String name);
}
