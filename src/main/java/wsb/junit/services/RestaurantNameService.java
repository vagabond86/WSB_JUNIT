package wsb.junit.services;

import org.springframework.stereotype.Service;
import wsb.junit.models.Restaurant;

@Service
public class RestaurantNameService {

    public String getReversName(Restaurant restaurant){
        return new StringBuffer(restaurant.getName()).reverse().toString();
    }


}
