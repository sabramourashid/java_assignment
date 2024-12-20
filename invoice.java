public class invoice {
    private String partNumber;
    private String partDescription;
    private int QttyOfPurchasedItem;
    private int pricePerItem;

    public invoice(String partNumber, String partDescription,  int QttyOfPurchasedItem,  int pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.QttyOfPurchasedItem = QttyOfPurchasedItem;
        this.pricePerItem = pricePerItem;
    }

 public int getInvoiceAmount() {
    return QttyOfPurchasedItem * pricePerItem;
    if (QttyOfPurchasedItem > 0) {
        this. QttyOfPurchasedItem = QttyOfPurchasedItem;
        return QttyOfPurchasedItem;
    }else{
        this.QttyOfPurchasedItem = 0;
    }

    if (pricePerItem > 0) {
        this. pricePerItem = pricePerItem;
        return pricePerItem; 
    }else{
        this.pricePerItem = 0;
     }
     return pricePerItem;
   /*  if  (QttyOfPurchasedItem  <= 0)
    this.QttyOfPurchasedItem = QttyOfPurchasedItem;
        return this.QttyOfPurchasedItem = 0;
    if (pricePerItem <= 0) 
        this.pricePerItem = pricePerItem;
        return this.pricePerItem = 0; */
 }

public static void main(String[] args) {
    invoice inv = new invoice("me","paid",12,10);
    System.out.println("the invoice amount is " + inv.getInvoiceAmount());
}
}