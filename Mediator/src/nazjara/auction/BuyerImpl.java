package nazjara.auction;

public class BuyerImpl extends Buyer {

    public BuyerImpl(String name, AuctionMediator auctionMediator) {
        super(name, auctionMediator);
    }

    @Override
    void bid(double amount) {
        auctionMediator.bid(this, amount);
    }

    @Override
    void cancelBid() {
        auctionMediator.cancelBid(this);
    }

    @Override
    void hasEnded(String name) {
        System.out.println(this.name + " is notified that auction " + name + " has ended");
    }
}
