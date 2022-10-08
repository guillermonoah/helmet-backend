package com.portafolio.helmet.services;

import com.portafolio.helmet.daos.CheckListDao;
import com.portafolio.helmet.entities.CheckList;
import com.portafolio.helmet.repositories.CheckListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CheckListService implements CheckListDao {

    @Autowired
    private CheckListRepository checkListRepository;

    @Override
    public List<CheckList> obtenerCheckList(){
        return (List<CheckList>) checkListRepository.findAll();
    }
    @Override
    public CheckList guardarCheckList(CheckList checkList){
        return checkListRepository.save(checkList);
    }
}
