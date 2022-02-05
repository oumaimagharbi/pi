package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.domain.Action;
import tn.esprit.spring.domain.ClassState;

public interface ClassStateService {

	List<ClassState> retrieveAllClassStates();

	ClassState addClassState(ClassState cs);

	ClassState updateClassState(ClassState cs);
}
