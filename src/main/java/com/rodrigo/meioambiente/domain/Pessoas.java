package com.rodrigo.meioambiente.domain;
import org.springframework.roo.addon.javabean.annotations.RooJavaBean;
import org.springframework.roo.addon.javabean.annotations.RooToString;
import org.springframework.roo.addon.jpa.annotations.activerecord.RooJpaActiveRecord;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class Pessoas {

    /**
     */
    @NotNull
    @Size(max = 200)
    private String cidade;

    /**
     */
    @NotNull
    @Size(max = 200)
    private String nome;

    /**
     */
    @Size(max = 20)
    private String rg;

    /**
     */
    @NotNull
    @Size(max = 25)
    private String cpf;

    /**
     */
    @Size(max = 15)
    private String telefone;
}
