package com.rodrigo.meioambiente.web;
import com.rodrigo.meioambiente.domain.Meioambiente;
import org.springframework.roo.addon.web.mvc.controller.annotations.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/meioambientes")
@Controller
@RooWebScaffold(path = "meioambientes", formBackingObject = Meioambiente.class)
public class MeioambienteController {
}
