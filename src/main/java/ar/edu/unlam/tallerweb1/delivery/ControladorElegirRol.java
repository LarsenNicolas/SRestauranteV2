package ar.edu.unlam.tallerweb1.delivery;

import ar.edu.unlam.tallerweb1.domain.SessionService;
import ar.edu.unlam.tallerweb1.domain.usuarios.RolUsuario;
import ar.edu.unlam.tallerweb1.domain.usuarios.ServicioUsuario;
import ar.edu.unlam.tallerweb1.domain.usuarios.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControladorElegirRol {
    private SessionService sessionService;
    private ServicioUsuario servicioUsuario;

    @Autowired
    public ControladorElegirRol(ServicioUsuario servicioUsuario, SessionService sessionService){
        this.servicioUsuario = servicioUsuario;
        this.sessionService = sessionService;
    }

    @RequestMapping("/elegir-role")
    public ModelAndView irAElegirRol() {
        ModelMap modelo = new ModelMap();
        RolUsuario rolUsuario = RolUsuario.Cliente;
        modelo.put("rolUsuario", rolUsuario);
        return new ModelAndView("elegir-role", modelo);
    }

    @RequestMapping("/setear-rol")
    public ModelAndView setearRol(String rolUsuario) {
        Usuario currentUser = this.sessionService.getCurrentUser();
        ModelMap model = new ModelMap();
        String redirect = "redirect:";
        servicioUsuario.seleccionarRol(rolUsuario, currentUser);
        return new ModelAndView(redirect+rolUsuario+"Home", model);
    }

    @RequestMapping("/setear-rol-mozo")
    public ModelAndView setearRolMozo() {
        Usuario currentUser = this.sessionService.getCurrentUser();
        ModelMap model = new ModelMap();
        servicioUsuario.seleccionarRol("Mozo", currentUser);
        return new ModelAndView("redirect:MozoHome", model);
    }

    @RequestMapping("/setear-rol-cliente")
    public ModelAndView setearRolCliente() {
        Usuario currentUser = this.sessionService.getCurrentUser();
        ModelMap model = new ModelMap();
        servicioUsuario.seleccionarRol("Cliente", currentUser);
        return new ModelAndView("redirect:ClienteHome", model);
    }

    @RequestMapping("/setear-rol-administrador")
    public ModelAndView setearRolAdministrador() {
        Usuario currentUser = this.sessionService.getCurrentUser();
        ModelMap model = new ModelMap();
        servicioUsuario.seleccionarRol("Administrador", currentUser);
        return new ModelAndView("redirect:AdministradorHome", model);
    }


}
