package alessiovulpinari.u2_w1_d4_Java.entities;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Drink extends MenuElement{

    public Drink(String name, Double price, int calories) {
        super(name, price, calories);
    }
}
