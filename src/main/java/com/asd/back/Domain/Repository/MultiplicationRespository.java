package com.asd.back.Domain.Repository;

import com.asd.back.Domain.Multiplication;

import java.util.List;
import java.util.Optional;

public interface MultiplicationRespository {
    List<Multiplication> getAllMultiplication();
    Optional<Multiplication> getMultiplication(int id);
    Multiplication saveMultiplication(Multiplication multiplication);
    void deleteMultiplication(int MultiplicationId);
}
