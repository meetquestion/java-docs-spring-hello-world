package com.example.demo.Service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.entity.People;

import java.util.List;

public interface PeopleService extends IService<People> {

    List<People> getPeopleList();
    int updateByName(People people);
}
