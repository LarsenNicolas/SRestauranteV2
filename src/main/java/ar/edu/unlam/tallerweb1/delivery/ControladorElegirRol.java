package ar.edu.unlam.tallerweb1.delivery;

import ar.edu.unlam.tallerweb1.domain.SessionService;
import ar.edu.unlam.tallerweb1.domain.usuarios.RolUsuario;
import ar.edu.unlam.tallerweb1.domain.usuarios.ServicioRegistroUsuario;
import ar.edu.unlam.tallerweb1.domain.usuarios.ServicioUsuario;
import ar.edu.unlam.tallerweb1.domain.usuarios.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControladorElegirRol extends ControladorBase {

    private ServicioUsuario servicioUsuario;

    @Autowired
    public ControladorElegirRol(ServicioUsuario servicioUsuario, SessionService sessionService){
        super(sessionService);
        this.servicioUsuario = servicioUsuario;
    }

    @RequestMapping("/elegir-role")
    public ModelAndView irAElegirRol() {
        ModelMap modelo = new ModelMap();
        RolUsuario rolUsuario = null;
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
}
