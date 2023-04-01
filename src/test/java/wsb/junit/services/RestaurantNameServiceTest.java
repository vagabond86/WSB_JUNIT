package wsb.junit.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import wsb.junit.models.Restaurant;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class RestaurantNameServiceTest {

    @InjectMocks
    RestaurantNameService restaurantNameService;

    @Test
    void getReversName() {
        // arrange
        Restaurant restaurant = new Restaurant(1L,"Restauracja","Ulica", "Miasto");

        // act
        String result = restaurantNameService.getReversName(restaurant);

        // assert
        assertEquals("ajcaruatseR", result);
    }
}