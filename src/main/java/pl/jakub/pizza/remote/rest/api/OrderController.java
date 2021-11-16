package pl.jakub.pizza.remote.rest.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.jakub.pizza.domain.model.OrderStatusType;
import pl.jakub.pizza.remote.rest.dto.request.AddOrderDto;
import pl.jakub.pizza.remote.rest.dto.request.UpdatedOrderDto;
import pl.jakub.pizza.remote.rest.dto.response.OrderCollectionDto;
import pl.jakub.pizza.remote.rest.dto.response.OrderDto;
import pl.jakub.pizza.remote.rest.dto.response.TokenDto;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RequestMapping(value = "/api/v1/orders", produces = APPLICATION_JSON_VALUE)
@RestController
public class OrderController {

    @PostMapping
    public ResponseEntity<TokenDto> addOrder(@RequestBody AddOrderDto addOrderDto){
        return ResponseEntity.ok(null);
    }

    @GetMapping
    public ResponseEntity<OrderCollectionDto> getOrders(@RequestParam("status") OrderStatusType orderStatusType,
                                                        @RequestHeader("Access-Token") String token){
        return ResponseEntity.ok(null);
    }

    @DeleteMapping("/{order-id}")
    public ResponseEntity<Void> deleteOrder(@RequestHeader("Access-Token") String token,
                                            @PathVariable("order-id") Integer orderId){
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{order-id}")
    public ResponseEntity<OrderDto> updateOrder(@PathVariable("order-id") Integer orderId,
                                                @RequestHeader("Access-Token") String token,
                                                @RequestBody UpdatedOrderDto updatedOrderDto){
        return ResponseEntity.ok(null);
    }

}
