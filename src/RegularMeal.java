public class RegularMeal extends Meal {
    private boolean isVegetarian;


    public boolean isVegetarian() {
        return isVegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        isVegetarian = vegetarian;
    }

    public RegularMeal(){
        super();
        isVegetarian = false;
    }
    public RegularMeal(String orderID, String customerName, int quantity ,boolean isVegetarian){
        super(orderID, customerName, quantity);
        this.isVegetarian = isVegetarian;
    }

    @Override
    public double calculateBill() {
        return 10 * getQuantity();
    }

    @Override
    public void displayOrderDetails() {
        super.displayOrderDetails();
        System.out.println("IsVegetarian: " + isVegetarian);
    }

}
