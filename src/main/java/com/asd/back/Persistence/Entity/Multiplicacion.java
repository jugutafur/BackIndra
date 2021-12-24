package com.asd.back.Persistence.Entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "multiplicacion")
public class Multiplicacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Date fecha;
    @Column(name = "numerouno")
    private Long numeroUno;
    @Column(name = "numerodos")
    private Long numeroDos;
    private Long resultado;

    public Integer getId() {return id;}
    public void setId(Integer id) {this.id = id;}

    public Date getFecha() {return fecha;}
    public void setFecha(Date fecha) {this.fecha = fecha;}

    public Long getNumeroUno() {return numeroUno;}
    public void setNumeroUno(Long numeroUno) {this.numeroUno = numeroUno;}

    public Long getNumeroDos() {return numeroDos;}
    public void setNumeroDos(Long numeroDos) {this.numeroDos = numeroDos;}

    public Long getResultado() {return resultado;}
    public void setResultado(Long resultado) {this.resultado = resultado;}
}
