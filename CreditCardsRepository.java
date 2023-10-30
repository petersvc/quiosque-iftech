import java.util.HashMap;

public class CreditCardsRepository {

    private final HashMap<String, CreditCard> creditCards;

    public CreditCardsRepository() {
        this.creditCards = new HashMap<>();
        this.loadCreditCards();
    }

    public CreditCard findCreditCard(String key) {
        return creditCards.getOrDefault(key, null);
    }

    public HashMap<String, CreditCard> getCreditCards() {
        return this.creditCards;
    }

    private void loadCreditCards() {
        this.creditCards.put("1", new CreditCard("1", "111", "01/21", 100.00, "João"));
        this.creditCards.put("2", new CreditCard("2", "222", "02/22", 170.00, "Maria"));
        this.creditCards.put("3", new CreditCard("3", "333", "03/23", 200.00, "José"));
        this.creditCards.put("4", new CreditCard("4", "444", "04/24", 80.00, "Ana"));
    }
}
