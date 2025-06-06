public class Meal {
    private String orderID;
    private String customerName;
    private int quantity;


    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Meal() {
        this.orderID = "N/A";
        this.customerName = "N/A";
        this.quantity = 0;

    }
    public Meal(String orderID, String customerName, int quantity) {
        this.orderID = orderID;
        this.customerName = customerName;
        this.quantity = quantity;
    }
    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderID);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Bill: "+calculateBill());
    }
    public double calculateBill(){
        return quantity * 12;
    }
    public double calculateBill(int couponAmount){
        if (calculateBill() - couponAmount < 0){
            return 0;
        }
        return calculateBill() - couponAmount;
    }

}
