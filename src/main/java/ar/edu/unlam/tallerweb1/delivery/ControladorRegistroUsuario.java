package ar.edu.unlam.tallerweb1.delivery;

import ar.edu.unlam.tallerweb1.domain.SessionService;
import ar.edu.unlam.tallerweb1.domain.usuarios.ServicioRegistroUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControladorRegistroUsuario {
    private SessionService sessionService;
    private ServicioRegistroUsuario servicioRegistroUsuario;

    @Autowired
    public ControladorRegistroUsuario(ServicioRegistroUsuario servicioRegistroUsuario, SessionService sessionService){
        this.servicioRegistroUsuario = servicioRegistroUsuario;
        this.sessionService = sessionService;
    }

    @RequestMapping("/registrar-usuario")
    public ModelAndView irARegistrarUsuario() {
        ModelMap modelo = new ModelMap();
        modelo.put("datosLogin", new DatosLogin());
        return new ModelAndView("registro-usuario", modelo);
    }

    @RequestMapping(path = "/validar-registro", method = RequestMethod.POST)
    public ModelAndView validarRegistro(@ModelAttribute("datosLogin") DatosLogin datosLogin) {
        ModelMap model = new ModelMap();
        try {
            servicioRegistroUsuario.registrarNuevoUsuario(datosLogin.getEmail(), datosLogin.getPassword());
            return new ModelAndView("redirect:/elegir-role", model);
        } catch (Exception e){
            model.put("error", e.getMessage());
            return new ModelAndView("registro-usuario", model);
        }
    }
}
