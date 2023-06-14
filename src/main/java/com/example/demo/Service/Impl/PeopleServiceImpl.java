package com.example.demo.Service.Impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.Service.PeopleService;
import com.example.demo.entity.People;
import com.example.demo.mapper.PeopleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeopleServiceImpl extends ServiceImpl<PeopleMapper, People> implements PeopleService {

    @Autowired
    private PeopleMapper peopleMapper;

    @Override
    public List<People> getPeopleList() {
        List<People> peopleList = peopleMapper.getPeopleList();
        return peopleList;
    }

    @Override
    public int updateByName(People people) {
        int i = 0;
        try{
            i = peopleMapper.updateByName(people);
        }catch (Exception e){
            log.error("error",e);
        }
        return i;
    }

}
