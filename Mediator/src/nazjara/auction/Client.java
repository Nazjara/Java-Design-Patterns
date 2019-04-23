package nazjara.auction;

public class Client {

    public static void main(String[] args) {
        AuctionMediator auctionMediator = new AuctionMediatorImpl("Auction1");

        Buyer buyer1 = new BuyerImpl("Buyer1", auctionMediator);
        Buyer buyer2 = new BuyerImpl("Buyer2", auctionMediator);
        Buyer buyer3 = new BuyerImpl("Buyer3", auctionMediator);

        auctionMediator.addBuyer(buyer1);
        auctionMediator.addBuyer(buyer2);
        auctionMediator.addBuyer(buyer3);

        buyer1.bid(10.0);
        buyer2.bid(20.0);
        buyer3.bid(30.0);

        auctionMediator.determineWinner();
        auctionMediator.notifyAboutEnding();

        System.out.println("------------------------------------------------------");

        auctionMediator = new AuctionMediatorImpl("Auction2");

        buyer1 = new BuyerImpl("Buyer1", auctionMediator);
        buyer2 = new BuyerImpl("Buyer2", auctionMediator);
        buyer3 = new BuyerImpl("Buyer3", auctionMediator);

        auctionMediator.addBuyer(buyer1);
        auctionMediator.addBuyer(buyer2);
        auctionMediator.addBuyer(buyer3);

        buyer1.bid(30.0);
        buyer2.bid(20.0);
        buyer3.bid(10.0);
        buyer1.cancelBid();

        auctionMediator.determineWinner();
        auctionMediator.notifyAboutEnding();
    }
}
