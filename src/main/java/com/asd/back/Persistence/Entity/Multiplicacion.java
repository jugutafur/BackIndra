package com.asd.back.Persistence.Entity;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Date;

@Entity
@Table(name = "multiplicacion")
public class Multiplicacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Date fecha;
    @Column(name = "numerouno")
    private BigInteger numeroUno;
    @Column(name = "numerodos")
    private BigInteger numeroDos;
    private BigInteger resultado;

    public Integer getId() {return id;}
    public void setId(Integer id) {this.id = id;}

    public Date getFecha() {return fecha;}
    public void setFecha(Date fecha) {this.fecha = fecha;}

    public BigInteger getNumeroUno() {return numeroUno;}
    public void setNumeroUno(BigInteger numeroUno) {this.numeroUno = numeroUno;}

    public BigInteger getNumeroDos() {return numeroDos;}
    public void setNumeroDos(BigInteger numeroDos) {this.numeroDos = numeroDos;}

    public BigInteger getResultado() {return resultado;}
    public void setResultado(BigInteger resultado) {this.resultado = resultado;}
}
