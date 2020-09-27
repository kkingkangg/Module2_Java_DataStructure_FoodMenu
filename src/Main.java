import Model.Food;
import Service.FoodMenu;


public class Main {

    public static void main(String[] args) {
        FoodMenu foodMenu = new FoodMenu();

        // test findAll
//        System.out.println("Test findAll()");
//        foodMenu.display();

        //test add()
//        foodMenu.add(new Food(9, "Dorayaki", 60000));
//        foodMenu.display();

        //test update
//        foodMenu.update(4, new Food(4, "Taiyaki", 40000));
//        foodMenu.display();

        //test find by id
        System.out.println(foodMenu.findById(5));
        System.out.println(foodMenu.findById(10));

        //test find by name
        System.out.println(foodMenu.findByName("Tiramisu"));

        //
    }
}
