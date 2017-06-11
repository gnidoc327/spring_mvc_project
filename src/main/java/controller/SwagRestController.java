package controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kimhs on 2017-06-12.
 */
@RestController
@Api(value="swag-rest-contoller", description="swagtest")
@RequestMapping(value="/swag")
public class SwagRestController {
    @RequestMapping(value="/hello/{name}")
    public String getHelloName(@PathVariable(value="name") String name){
        return "Hello " + name;
    }
}
