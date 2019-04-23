package nazjara.auction;

public interface AuctionMediator {
    void addBuyer(Buyer buyer);
    void bid(Buyer buyer, double amount);
    void cancelBid(Buyer buyer);
    void determineWinner();
    void notifyAboutEnding();
}
