package pl.jakub.pizza.remote.rest.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.jakub.pizza.domain.model.SizeType;
import pl.jakub.pizza.remote.rest.dto.response.MenuDto;
import pl.jakub.pizza.remote.rest.dto.response.PizzaDto;
import pl.jakub.pizza.remote.rest.dto.response.SizeDto;

import java.math.BigDecimal;
import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RequestMapping(value = "/api/v1/menu", produces = APPLICATION_JSON_VALUE)
@RestController
public class MenuController {

    public ResponseEntity<MenuDto> getMenu(){

        SizeDto sizeDto = new SizeDto(1, SizeType.S, BigDecimal.valueOf(30.00));
        PizzaDto pizzaDto = new PizzaDto(1, "Margherita", List.of(sizeDto));
        MenuDto menuDto = new MenuDto(List.of(pizzaDto));

        return ResponseEntity.ok(menuDto);
    }

}
