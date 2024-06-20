package alessiovulpinari.u2_w1_d4_Java.repositories;

import alessiovulpinari.u2_w1_d4_Java.entities.MenuElement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface MenuElementRepository extends JpaRepository<MenuElement, UUID> {

}
