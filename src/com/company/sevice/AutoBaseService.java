package com.company.sevice;

import com.company.model.AutoBase;

import java.util.List;

public interface AutoBaseService {
    void addAllUser(AutoBase student);

    AutoBase getById(Long id) throws RuntimeException;

    void deleteById(Long id);

    List<AutoBase> addAllUser();
}
