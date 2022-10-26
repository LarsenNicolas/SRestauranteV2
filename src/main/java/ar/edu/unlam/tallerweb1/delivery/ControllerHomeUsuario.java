package ar.edu.unlam.tallerweb1.delivery;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerHomeUsuario {
    @RequestMapping("/AdministradorHome")
    public ModelAndView administradorHome() {
        ModelMap modelo = new ModelMap();
        return new ModelAndView("AdministradorHome", modelo);
    }

    @RequestMapping("/ClienteHome")
    public ModelAndView clienteHome() {
        ModelMap modelo = new ModelMap();
        return new ModelAndView("ClienteHome", modelo);
    }

    @RequestMapping("/MozoHome")
    public ModelAndView mozoHome() {
        ModelMap modelo = new ModelMap();
        return new ModelAndView("MozoHome", modelo);
    }

    @RequestMapping("/goHome")
    public ModelAndView irAHome() {

        ModelMap modelo = new ModelMap();
        return new ModelAndView("MozoHome", modelo);
    }

}
