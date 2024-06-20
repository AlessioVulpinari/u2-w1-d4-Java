package alessiovulpinari.u2_w1_d4_Java.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Topping extends MenuElement{

    public Topping(String name, Double price, int calories) {
        super(name, price, calories);
    }
}
