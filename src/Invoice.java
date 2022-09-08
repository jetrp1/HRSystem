public class Invoice implements Payable {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;


    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity should be > 0");
        }

        if (pricePerItem < 0) {
            throw new IllegalArgumentException("PricePerItem should be > 0");
        }

        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }

    public String toString() {
        return "Invoice partDescription=" + partDescription + ", partNumber=" + partNumber + ", pricePerItem="
                + pricePerItem + ", quantity=" + quantity + "]";
    }

    @Override
    public double getPaymentAmount() {
        return this.pricePerItem * this.quantity;
    }

    

    
}
