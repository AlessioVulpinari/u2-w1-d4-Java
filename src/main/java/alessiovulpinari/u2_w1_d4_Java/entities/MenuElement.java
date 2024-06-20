package alessiovulpinari.u2_w1_d4_Java.entities;


import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Getter
@Setter
@ToString
@NoArgsConstructor
public abstract class MenuElement {

    @Id
    @GeneratedValue
    @Setter(AccessLevel.NONE)
    protected UUID id;

    protected String name;
    protected Double price;
    protected int calories;

    public MenuElement(String name, Double price, int calories) {
        this.name = name;
        this.price = price;
        this.calories = calories;
    }
}
