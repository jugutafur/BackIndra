package com.asd.back.Persistence.Mapper;

import com.asd.back.Domain.Multiplication;
import com.asd.back.Persistence.Entity.Multiplicacion;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MultiplicacionMapper {

    @Mappings({
            @Mapping(source = "fecha", target = "dateCreate"),
            @Mapping(source = "numeroUno", target = "numberOne"),
            @Mapping(source = "numeroDos", target = "numberTwo"),
            @Mapping(source = "resultado", target = "result")
    })
    Multiplication toMultiplication(Multiplicacion multiplicacion);
    List<Multiplication> toListMultiplication(List<Multiplicacion> multiplicacions);

    @InheritInverseConfiguration
    Multiplicacion toMultiplicacion(Multiplication multiplication);
}
