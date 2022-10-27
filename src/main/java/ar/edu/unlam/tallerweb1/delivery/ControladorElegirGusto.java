package ar.edu.unlam.tallerweb1.delivery;

import ar.edu.unlam.tallerweb1.domain.SessionService;
import ar.edu.unlam.tallerweb1.domain.system.Gusto;
import ar.edu.unlam.tallerweb1.domain.usuarios.ServicioUsuario;
import ar.edu.unlam.tallerweb1.domain.usuarios.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControladorElegirGusto {
    private SessionService sessionService;
    private ServicioUsuario servicioUsuario;

    @Autowired
    public ControladorElegirGusto(ServicioUsuario servicioUsuario, SessionService sessionService){
        this.servicioUsuario = servicioUsuario;
        this.sessionService = sessionService;
    }

    @RequestMapping("/elegir-gusto")
    public ModelAndView elegirGusto() {
        ModelMap modelo = new ModelMap();
        return new ModelAndView("elegir-gusto", modelo);
    }

    @RequestMapping("/setear-gusto-dulce")
    public ModelAndView setearGustoDulce() {
        Usuario currentUser = this.sessionService.getCurrentUser();
        ModelMap model = new ModelMap();
        servicioUsuario.seleccionarGusto(Gusto.Dulce, currentUser);
        return new ModelAndView("redirect:ClienteHome", model);
    }

    @RequestMapping("/setear-gusto-salado")
    public ModelAndView setearGustoSalado() {
        Usuario currentUser = this.sessionService.getCurrentUser();
        ModelMap model = new ModelMap();
        servicioUsuario.seleccionarGusto(Gusto.Salado, currentUser);
        return new ModelAndView("redirect:ClienteHome", model);
    }

    @RequestMapping("/setear-gusto-agridulce")
    public ModelAndView setearGustoAgridulce() {
        Usuario currentUser = this.sessionService.getCurrentUser();
        ModelMap model = new ModelMap();
        servicioUsuario.seleccionarGusto(Gusto.Agridulce, currentUser);
        return new ModelAndView("redirect:ClienteHome", model);
    }

    @RequestMapping("/setear-gusto-picante")
    public ModelAndView setearGustoPicante() {
        Usuario currentUser = this.sessionService.getCurrentUser();
        ModelMap model = new ModelMap();
        servicioUsuario.seleccionarGusto(Gusto.Picante, currentUser);
        return new ModelAndView("redirect:ClienteHome", model);
    }

    @RequestMapping("/setear-gusto-saludable")
    public ModelAndView setearGustoSaludable() {
        Usuario currentUser = this.sessionService.getCurrentUser();
        ModelMap model = new ModelMap();
        servicioUsuario.seleccionarGusto(Gusto.Saludable, currentUser);
        return new ModelAndView("redirect:ClienteHome", model);
    }
}
