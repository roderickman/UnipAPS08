package com.rodrigo.meioambiente.domain;
import org.springframework.roo.addon.javabean.annotations.RooJavaBean;
import org.springframework.roo.addon.javabean.annotations.RooToString;
import org.springframework.roo.addon.jpa.annotations.activerecord.RooJpaActiveRecord;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class Meioambiente {

    /**
     */
    @NotNull
    @Size(max = 200)
    private String descricao;

    /**
     */
    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Date data_hr;

    /**
     */
    @NotNull
    @Size(max = 200)
    private String local_rua;

    /**
     */
    @NotNull
    @Size(max = 15)
    private String local_numero;

    /**
     */
    @Size(max = 50)
    private String local_complemento;

    /**
     */
    @NotNull
    @Size(max = 100)
    private String local_cidade;

    /**
     */
    @NotNull
    @Size(max = 100)
    private String local_estado;
}
