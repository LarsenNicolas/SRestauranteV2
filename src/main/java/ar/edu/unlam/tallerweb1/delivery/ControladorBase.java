package ar.edu.unlam.tallerweb1.delivery;

import ar.edu.unlam.tallerweb1.domain.SessionService;
import org.springframework.stereotype.Controller;

@Controller
public class ControladorBase {
    protected SessionService sessionService;

    public ControladorBase() {}
    public ControladorBase(SessionService sessionService) {
        this.sessionService = sessionService;
    }
}
