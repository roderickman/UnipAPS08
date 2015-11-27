package com.rodrigo.meioambiente.web;
import com.rodrigo.meioambiente.domain.Pessoas;
import org.springframework.roo.addon.web.mvc.controller.annotations.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/pessoases")
@Controller
@RooWebScaffold(path = "pessoases", formBackingObject = Pessoas.class)
public class PessoasController {
}
