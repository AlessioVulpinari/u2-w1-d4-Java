package alessiovulpinari.u2_w1_d4_Java;

import alessiovulpinari.u2_w1_d4_Java.entities.*;
import alessiovulpinari.u2_w1_d4_Java.services.MenuElementService;
import alessiovulpinari.u2_w1_d4_Java.services.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class MenuElementRunner implements CommandLineRunner {

    @Autowired
    private MenuElementService menuElementService;

    @Autowired
    private MenuService menuService;

    @Override
    public void run(String... args) throws Exception {

        Topping ham = new Topping("Ham", 0.99, 35);
        Topping pineapple = new Topping("Pineapple", 0.79, 24);
        Pizza hawaiianPizza = new Pizza("Hawaiian Pizza", 6.49, 1024, Arrays.asList(ham, pineapple));

        Drink water = new Drink("Water", 0.99, 0);

        Menu menu = new Menu(Arrays.asList(menuElementService.findToppingByName(ham.getName()), menuElementService.findToppingByName(pineapple.getName())),
                Arrays.asList(menuElementService.findPizzaByName(hawaiianPizza.getName())), Arrays.asList(menuElementService.findDrinkByName(water.getName())));

       // menuService.saveMenu(menu);

        List<MenuElement> menuElements = menuElementService.filterByCalories();

        System.out.println(menuElements);

        /* menuElementService.saveMenuElement(ham);
        menuElementService.saveMenuElement(pineapple);
        menuElementService.saveMenuElement(hawaiianPizza); */


    }
}
