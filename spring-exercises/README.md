# Flowable - Spring exercises

### Exercise 1
Please solve the cyclic dependency that is preventing the application from starting.


### Exercise 2
Please write the appropriate code to have a rest endpoint under `localhost:8080/now` that returns
the local time appropriately formatted with the pattern given in `application.properties` using 
the class `DateTimeService`.

The class `DateTimeControllerTest` already contains the method test that should pass to qualify this
exercise as correct


### Exercise 3
Please write the appropriate code that logs all method calls (including parameters value) for all
present and future classes. For example:
`DateTimeService.now was called. Parameters: {parameter1=value1, parameter2=value2}`


### Exercise 4
Please write the appropriate code that catches all exceptions that can happen on the REST api, 
and for all of them returns the error `Something bad happened  (╯°□°）╯︵ ┻━┻`


### Exercise 5
Modify `ExerciseFiveService.java` for it to do the following actions:
1. Insert 1 new person(firstName, lastName) in the database
2. Insert 2 new persons in the database, but throw an exception sometimes after inserting the second
one (using `throwErrorSometimes()` method)

As it is now, if an exception is thrown after the third insert, all persons are persisted. 
After completing the exercise, the end result should be that the first person should be persisted always, but the 2 new persons from step 2 
shouldn't be on the database. You can use `ExerciseFiveController.java` to verify your code.


### Exercise 6
Please write a rest endpoint that returns the number of seconds since the application started


### Exercise 7
Please create a new spring boot app that provides a url where you can pass a number, and the app
returns that number times multiplied by two. (Do it in less than 5 minutes)




## To import the project in your ide
Import the project as a maven project using the given pom.xml file

## To execute the tests
run `mvn clean test`