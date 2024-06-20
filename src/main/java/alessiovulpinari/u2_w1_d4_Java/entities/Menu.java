package alessiovulpinari.u2_w1_d4_Java.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "menu")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Menu {

    @Id
    @GeneratedValue
    private UUID id;

    @ManyToMany
    private List<Topping> toppings;

    @ManyToMany
    private List<Pizza> pizzas;

    @ManyToMany
    private List<Drink> drinks;

    public Menu(List<Topping> toppings, List<Pizza> pizzas, List<Drink> drinks) {
        this.toppings = toppings;
        this.pizzas = pizzas;
        this.drinks = drinks;
    }
}
