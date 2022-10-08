package com.portafolio.helmet.controllers;

import com.portafolio.helmet.daos.CheckListDao;
import com.portafolio.helmet.entities.CheckList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/checklist")
public class CheckListController {

    @Autowired
    private CheckListDao checkListDao;

    @GetMapping
    public List<CheckList> obtenerCheckList(){return checkListDao.obtenerCheckList();}

    @PostMapping
    public CheckList guardarCheckList(@RequestBody CheckList checkList){
        return checkListDao.guardarCheckList(checkList);
    }
}
