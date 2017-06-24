package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by howell on 17-6-24.
 */
@RestController
public class IndexController {

    @RequestMapping(value = "/" ,method = RequestMethod.GET)
    public void index(HttpServletResponse response){
        try {
            response.getWriter().print("Hi!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
