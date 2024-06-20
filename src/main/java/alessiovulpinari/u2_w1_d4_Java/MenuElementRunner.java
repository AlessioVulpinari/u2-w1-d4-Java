package alessiovulpinari.u2_w1_d4_Java;

import alessiovulpinari.u2_w1_d4_Java.entities.MenuElement;
import alessiovulpinari.u2_w1_d4_Java.entities.Pizza;
import alessiovulpinari.u2_w1_d4_Java.entities.Topping;
import alessiovulpinari.u2_w1_d4_Java.services.MenuElementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class MenuElementRunner implements CommandLineRunner {

    @Autowired
    private MenuElementService menuElementService;

    @Override
    public void run(String... args) throws Exception {

        Topping ham = new Topping("Ham", 0.99, 35);
        Topping pineapple = new Topping("Pineapple", 0.79, 24);
        Pizza hawaiianPizza = new Pizza("Hawaiian Pizza", 6.49, 1024, Arrays.asList(ham, pineapple));

        menuElementService.saveMenuElement(ham);
        menuElementService.saveMenuElement(pineapple);
        menuElementService.saveMenuElement(hawaiianPizza);
    }
}
