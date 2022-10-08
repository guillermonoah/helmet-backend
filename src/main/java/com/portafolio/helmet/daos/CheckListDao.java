package com.portafolio.helmet.daos;

import com.portafolio.helmet.entities.CheckList;

import java.util.List;

public interface CheckListDao {
    List<CheckList> obtenerCheckList();

    CheckList guardarCheckList(CheckList checkList);
}
