package Service;

import Model.Food;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FoodMenu implements Service.Manager<Food> {
    static List<Food> menuFoods = new ArrayList<Food>();
    static {
        menuFoods.add(new Food(1, "Gateaux", 300000));
        menuFoods.add(new Food(2, "Gyeongdan", 100000));
        menuFoods.add(new Food(3, "Bingsu", 50000));
        menuFoods.add(new Food(4, "Cheese", 30000));
        menuFoods.add(new Food(5, "MangoMousse", 80000));
        menuFoods.add(new Food(6, "Mochi", 60000));
        menuFoods.add(new Food(7, "Macaron", 80000));
        menuFoods.add(new Food(8, "Tiramisu", 21000));
    }
    @Override
    public void add(Food object) {
        boolean flag = true;
        for (int i = 0; i < menuFoods.size(); i++) {
            if (object.getId() == menuFoods.get(i).getId()){
                flag = false;
                break;
            }
        }
        if(flag)
            menuFoods.add(object);
    }

    @Override
    public void update(int id, Food object) {
        for (int i = 0; i < menuFoods.size(); i++) {
            if(id == menuFoods.get(i).getId())
                menuFoods.set(i, object);
        }
    }

    @Override
    public void delete(int id) {
        for (int i = 0; i < menuFoods.size(); i++) {
            if(id == menuFoods.get(i).getId())
                menuFoods.remove(i);
        }
    }

    @Override
    public void display() {
        Iterator<Food> foods = menuFoods.iterator();
        while (foods.hasNext())
            System.out.println(foods.next());
    }

    @Override
    public Food findById(int id) {
        for (int i = 0; i < menuFoods.size(); i++) {
            if(id == menuFoods.get(i).getId())
                return menuFoods.get(i);
        }
        return null;
    }

    @Override
    public Food findByName(String name) {
        for(Food food:menuFoods){
            if(food.getName().equals(name)){
                return food;
            }
        }
        return null;
    }

    @Override
    public List<Food> findAll() {
        List<Food> outputList = new ArrayList<>();
        for (Food food:menuFoods){
            outputList.add(food);
        }
        return outputList;
    }
}
