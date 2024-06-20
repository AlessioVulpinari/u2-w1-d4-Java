package alessiovulpinari.u2_w1_d4_Java.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Pizza extends MenuElement {

   @OneToMany
   private List<Topping> toppings;

    public Pizza(String name, Double price, int calories, List<Topping> toppings) {
        super(name, price, calories);
        this.toppings = toppings;
    }
}
