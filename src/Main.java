//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
         RegularMeal regularMeal = new RegularMeal();
         ComboMeal comboMeal = new ComboMeal("221","AppleMAngo",23);

         regularMeal.calculateBill(2);

         comboMeal.setIncludesDrinkAndDesert(true);
         regularMeal.setVegetarian(true);


         comboMeal.displayOrderDetails();
        System.out.println("Bill With 2$ coupon "+ comboMeal.calculateBill(2));

        System.out.println();
         regularMeal.displayOrderDetails();
        System.out.println("Bill With 4$ coupon "+ regularMeal.calculateBill(4));


    }
}