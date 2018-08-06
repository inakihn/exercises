package com.flowable.spring.service.exercisefive;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class ExerciseFiveService {

    private final PersonRepository personRepository;

    @Autowired
    public ExerciseFiveService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public void tryToAddThreePersons() {
        personRepository.save(new Person("John", "Snow"));
        personRepository.save(new Person("Daenerys", "Targaryen"));
        personRepository.save(new Person("Cersei", "Lannister"));

        throwErrorSometimes();
    }

    private void throwErrorSometimes() {
        Random random = new Random();
        int randomNumber = random.nextInt(10);
        if (randomNumber < 8) {
            throw new RuntimeException("Sorry, something happened");
        }
    }

}
