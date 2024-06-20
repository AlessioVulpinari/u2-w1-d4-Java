package alessiovulpinari.u2_w1_d4_Java.repositories;

import alessiovulpinari.u2_w1_d4_Java.entities.Drink;
import alessiovulpinari.u2_w1_d4_Java.entities.MenuElement;
import alessiovulpinari.u2_w1_d4_Java.entities.Pizza;
import alessiovulpinari.u2_w1_d4_Java.entities.Topping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface MenuElementRepository extends JpaRepository<MenuElement, UUID> {


    Topping findToppingByName(String name);
    Drink findDrinkByName(String name);
    Pizza findPizzaByName(String name);

    @Query("SELECT m FROM MenuElement m ORDER BY m.calories")
    List<MenuElement> filterByCalories();
}
