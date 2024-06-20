package alessiovulpinari.u2_w1_d4_Java.services;

import alessiovulpinari.u2_w1_d4_Java.entities.Drink;
import alessiovulpinari.u2_w1_d4_Java.entities.MenuElement;
import alessiovulpinari.u2_w1_d4_Java.entities.Pizza;
import alessiovulpinari.u2_w1_d4_Java.entities.Topping;
import alessiovulpinari.u2_w1_d4_Java.repositories.MenuElementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.*;

@Service
public class MenuElementService {

    @Autowired
    private MenuElementRepository menuElementRepository;

    public void saveMenuElement(MenuElement menuElement) {
        menuElementRepository.save(menuElement);

        System.out.println("Elemento con id: " + menuElement.getId() + " salvato correttamente!");
    }

    public Topping findToppingByName(String name) {
        return menuElementRepository.findToppingByName(name);
    }

    public Drink findDrinkByName(String name) {
        return menuElementRepository.findDrinkByName(name);
    }

    public Pizza findPizzaByName(String name) {
        return menuElementRepository.findPizzaByName(name);
    }
}
