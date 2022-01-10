package com.company.Dao;

import com.company.model.AutoBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AutoBaseDao {
    Map<Long, AutoBase> dao = new HashMap<>();

    public void addAllUser(AutoBase student) {
        dao.put(student.getId(), student);
    }

    public AutoBase getById(Long id) {
        return dao.get(id);

    }

    public void deleteById(Long id) {
        dao.remove(id);
    }

    public List<AutoBase> addAllUser(AutoBase autoBase) {
        return dao.values().stream().toList();
    }
}
}
