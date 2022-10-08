package com.portafolio.helmet.repositories;

import com.portafolio.helmet.entities.CheckList;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CheckListRepository extends CrudRepository<CheckList, Long> {
}
