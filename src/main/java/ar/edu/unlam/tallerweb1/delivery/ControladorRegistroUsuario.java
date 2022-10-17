package ar.edu.unlam.tallerweb1.delivery;

import ar.edu.unlam.tallerweb1.domain.SessionService;
import ar.edu.unlam.tallerweb1.domain.usuarios.ServicioRegistroUsuario;
import ar.edu.unlam.tallerweb1.domain.usuarios.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControladorRegistroUsuario {

    private ServicioRegistroUsuario servicioRegistroUsuario;
    private SessionService sessionService;

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
        Usuario usuarioValidado = servicioRegistroUsuario.registrarNuevoUsuario(datosLogin.getEmail(), datosLogin.getPassword());
        if (usuarioValidado != null) {
            this.sessionService.setActualUser(usuarioValidado);
            return new ModelAndView("redirect:/elegir-role");
        } else {
            model.put("error", "Usuario o clave incorrecta");
        }
        return new ModelAndView("login", model);
    }
}
