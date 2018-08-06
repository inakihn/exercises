package com.flowable.spring.service.exercisefive;

import java.util.List;

public class ExerciseFiveController {

    private final ExerciseFiveService exerciseFiveService;

    private final PersonRepository personRepository;

    public ExerciseFiveController(ExerciseFiveService exerciseFiveService,
                                  PersonRepository personRepository) {
        this.exerciseFiveService = exerciseFiveService;
        this.personRepository = personRepository;
    }

    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }

    public void tryToAddThreePersons() {
        exerciseFiveService.tryToAddThreePersons();
    }
    
}
