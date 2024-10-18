package online.phoenixcity.firmiana.controller.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestContrller {
    @GetMapping
    public void test(){
        System.out.println("test");
    }
}
