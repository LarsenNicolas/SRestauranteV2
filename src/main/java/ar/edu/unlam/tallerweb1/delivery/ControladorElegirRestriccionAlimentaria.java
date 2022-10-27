package ar.edu.unlam.tallerweb1.delivery;

import ar.edu.unlam.tallerweb1.domain.SessionService;
import ar.edu.unlam.tallerweb1.domain.system.Gusto;
import ar.edu.unlam.tallerweb1.domain.system.RestriccionAlimentaria;
import ar.edu.unlam.tallerweb1.domain.usuarios.ServicioUsuario;
import ar.edu.unlam.tallerweb1.domain.usuarios.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControladorElegirRestriccionAlimentaria {
    private SessionService sessionService;
    private ServicioUsuario servicioUsuario;

    @Autowired
    public ControladorElegirRestriccionAlimentaria(ServicioUsuario servicioUsuario, SessionService sessionService){
        this.servicioUsuario = servicioUsuario;
        this.sessionService = sessionService;
    }

    @RequestMapping("/elegir-restriccion")
    public ModelAndView elegirRestriccion() {
        ModelMap modelo = new ModelMap();
        return new ModelAndView("elegir-restriccion", modelo);
    }

    @RequestMapping("/setear-vegano")
    public ModelAndView setearGustoVegano() {
        Usuario currentUser = this.sessionService.getCurrentUser();
        ModelMap model = new ModelMap();
        servicioUsuario.seleccionarRestriccion(RestriccionAlimentaria.Vegano, currentUser);
        return new ModelAndView("redirect:ClienteHome", model);
    }

    @RequestMapping("/setear-vegetariano")
    public ModelAndView setearSalado() {
        Usuario currentUser = this.sessionService.getCurrentUser();
        ModelMap model = new ModelMap();
        servicioUsuario.seleccionarRestriccion(RestriccionAlimentaria.Vegetariano, currentUser);
        return new ModelAndView("redirect:ClienteHome", model);
    }

    @RequestMapping("/setear-celiaco")
    public ModelAndView setearCeliaco() {
        Usuario currentUser = this.sessionService.getCurrentUser();
        ModelMap model = new ModelMap();
        servicioUsuario.seleccionarRestriccion(RestriccionAlimentaria.Celiaco, currentUser);
        return new ModelAndView("redirect:ClienteHome", model);
    }

    @RequestMapping("/setear-diabetico")
    public ModelAndView setearDiabetico() {
        Usuario currentUser = this.sessionService.getCurrentUser();
        ModelMap model = new ModelMap();
        servicioUsuario.seleccionarRestriccion(RestriccionAlimentaria.Diabetico, currentUser);
        return new ModelAndView("redirect:ClienteHome", model);
    }

    @RequestMapping("/setear-hipertenso")
    public ModelAndView setearGustoSaludable() {
        Usuario currentUser = this.sessionService.getCurrentUser();
        ModelMap model = new ModelMap();
        servicioUsuario.seleccionarRestriccion(RestriccionAlimentaria.Hipertenso, currentUser);
        return new ModelAndView("redirect:ClienteHome", model);
    }
}
