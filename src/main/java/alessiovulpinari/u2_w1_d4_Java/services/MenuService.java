package alessiovulpinari.u2_w1_d4_Java.services;

import alessiovulpinari.u2_w1_d4_Java.repositories.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MenuService {

    @Autowired
    private MenuRepository menuRepository;
}
