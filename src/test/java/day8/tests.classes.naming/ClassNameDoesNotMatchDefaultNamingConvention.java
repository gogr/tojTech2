package day8.tests.classes.naming;

import org.junit.Test;

//Name of class with test should match pattern:
//        "**/Test*.java" - start with "Test".
//        "**/*Test.java" - end with "Test".
//        "**/*Tests.java" - end with "Tests".
//        "**/*TestCase.java" - end with "TestCase".
public class ClassNameDoesNotMatchDefaultNamingConvention {
    @Test
    public void thisIsTestInClassThatStartsWithTestWord(){
        System.out.println("THIS CLASS NAME DOESN'T MATCH NAMING CONVENTION FOR CLASSES WITH TESTS.");
    }
}
