package com.company.sevice;

import com.company.Dao.AutoBaseDao;
import com.company.model.AutoBase;

import java.util.List;

public class AutoServiceImpl implements AutoBaseService{
    AutoBaseDao dao = new AutoBaseDao();


    @Override
    public void addAllUser(AutoBase autoBase) {
        dao.addAllUser(autoBase);
    }

    @Override
    public AutoBase getById(Long id) throws RuntimeException {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public List<AutoBase> addAllUser() {
        return null;
    }
}
