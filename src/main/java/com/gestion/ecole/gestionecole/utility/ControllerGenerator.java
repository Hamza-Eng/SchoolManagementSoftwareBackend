package com.gestion.ecole.gestionecole.utility;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

public interface ControllerGenerator<T> {

	T saveOrUpdate(T t);

	Optional<T> findById(Long id);

	Optional<T> findByCriteria(HashMap<String, String> map);

	Boolean delete(Long id);

	Boolean deleteAll();

	List<T> findAll();

}
