package com.asd.back.Persistence;

import com.asd.back.Domain.Multiplication;
import com.asd.back.Domain.Repository.MultiplicationRespository;
import com.asd.back.Persistence.CRUD.MultiplicationCRUDRepository;
import com.asd.back.Persistence.Entity.Multiplicacion;
import com.asd.back.Persistence.Mapper.MultiplicacionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class MultiplicacionRepository implements MultiplicationRespository {

    @Autowired
    private MultiplicationCRUDRepository multiplicationCRUDRepository;

    @Autowired
    private MultiplicacionMapper multiplicacionMapper;


    @Override
    public List<Multiplication> getAllMultiplication() {
        List<Multiplicacion> multiplicacions = (List<Multiplicacion>) multiplicationCRUDRepository.findAll();
        return multiplicacionMapper.toListMultiplication(multiplicacions);
    }

    @Override
    public Optional<Multiplication> getMultiplication(int id) {
        return multiplicationCRUDRepository.findById(id).map(Multiplication-> multiplicacionMapper.toMultiplication(Multiplication));
    }

    @Override
    public Multiplication saveMultiplication(Multiplication multiplication) {
        Multiplicacion multiplicacion = multiplicacionMapper.toMultiplicacion(multiplication);
        return multiplicacionMapper.toMultiplication(multiplicationCRUDRepository.save(multiplicacion));
    }

    @Override
    public void deleteMultiplication(int MultiplicationId) {
        multiplicationCRUDRepository.deleteById(MultiplicationId);
    }
}
