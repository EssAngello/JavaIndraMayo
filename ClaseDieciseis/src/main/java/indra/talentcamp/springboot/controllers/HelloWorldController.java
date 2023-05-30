package indra.talentcamp.springboot.controllers;

import indra.talentcamp.springboot.models.Automovil;
import indra.talentcamp.springboot.services.AutomovilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping(value = "/hello")
@RestController
public class HelloWorldController {

    @Autowired
    private AutomovilService service;

    @RequestMapping(path = "/api/helloWorld", method = RequestMethod.GET)
    public String helloWorld() {
        return "Hola Mundo";
    }

    @RequestMapping(path = "/api/nicehello", method = RequestMethod.GET)
    public String niceHello(){
        StringBuilder sb = new StringBuilder();
        sb.append("<html>");
        sb.append("<body>");
        sb.append("<h1>Hola Mundo Spring Boot</h1>");
        sb.append("</body>");
        sb.append("</html>");

        return sb.toString();
    }

    @RequestMapping(path = "/api/coche", method = RequestMethod.GET)
    public Automovil getAuto(){
        return this.service.autoDeElonMusk();
    }


}
