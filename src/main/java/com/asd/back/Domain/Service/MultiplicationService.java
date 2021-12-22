package com.asd.back.Domain.Service;

import com.asd.back.Domain.Multiplication;
import com.asd.back.Domain.Repository.MultiplicationRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MultiplicationService {

    @Autowired
    private MultiplicationRespository multiplicationRespository;


    public List<Multiplication> getAllMultiplication() {
        return multiplicationRespository.getAllMultiplication();
    }

    public Optional<Multiplication> getMultiplication(int id) {
        return multiplicationRespository.getMultiplication(id);}

    public Multiplication saveMultiplication(Multiplication multiplication) {
        return multiplicationRespository.saveMultiplication(multiplication);}

    public boolean deleteMultiplication(int multiplicationId) {
        return getMultiplication(multiplicationId).map(multiplication ->{
            multiplicationRespository.deleteMultiplication(multiplicationId);
            return true;
        }).orElse(false);
    }
}
