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
    private Integer numeroUno;
    @Column(name = "numerodos")
    private Integer numeroDos;
    private Integer resultado;

    public Integer getId() {return id;}
    public void setId(Integer id) {this.id = id;}

    public Date getFecha() {return fecha;}
    public void setFecha(Date fecha) {this.fecha = fecha;}

    public Integer getNumeroUno() {return numeroUno;}
    public void setNumeroUno(Integer numeroUno) {this.numeroUno = numeroUno;}

    public Integer getNumeroDos() {return numeroDos;}
    public void setNumeroDos(Integer numeroDos) {this.numeroDos = numeroDos;}

    public Integer getResultado() {return resultado;}
    public void setResultado(Integer resultado) {this.resultado = resultado;}
}
