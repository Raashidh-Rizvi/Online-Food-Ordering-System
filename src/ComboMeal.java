public class ComboMeal extends Meal {
    private boolean includesDrinkAndDesert;

    public boolean isIncludesDrinkAndDesert() {
        return includesDrinkAndDesert;
    }

    public void setIncludesDrinkAndDesert(boolean includesDrinkAndDesert) {
        this.includesDrinkAndDesert = includesDrinkAndDesert;
    }

    public ComboMeal() {
        super();
        this.includesDrinkAndDesert = false;
    }

    public ComboMeal(String orderID, String customerName, int quantity){
        super(orderID, customerName, quantity);
        this.includesDrinkAndDesert = false;

    }
    public void displayOrderDetails(){
        super.displayOrderDetails();
        System.out.println("Includes drink and desert: " + includesDrinkAndDesert);
    }
}
