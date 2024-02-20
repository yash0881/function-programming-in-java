import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {


        System.out.println("Hello world!");

        List<Integer> numbers = List.of(12,9,7,5,1,14,6);
        printAllNumbersInListStructureInFunctionalApproach(numbers);
        printEvenNumbersInListStructureInFunctionalApproach(numbers);
        printOddNumbersInListStructureInFunctionalApproach(numbers);
        printSquaresOfNumbersInListStructureInFunctionalApproach(numbers);
        printSquaresOfEvenInListStructureInFunctionalApproach(numbers);

        List<String> courses = List.of("Spring", "Spring boot", "API", "Micorservices", "DSA", "MERN");
        printAllCoursesInListStructureInFunctionalApproach(courses);
        printAllCoursesContainingSpringInListStructureInFunctionalApproach(courses);
        printAllCoursesContainingAtLeast4LettersInListStructureInFunctionalApproach(courses);
        printNumberOfCharacterWithCourseName(courses);

        List<String> fruits = List.of("apple", "banana", "mango", "butter");
        printFruitsStartWithB(fruits);
    }




    private static void print(int num)
    {
        System.out.println(num);
    }
    private static void printAllNumbersInListStructureInFunctionalApproach(List<Integer> numbers){

//      numbers.stream().forEach(Main::print);
//        numbers.stream().forEach(System.out::println);
    }

    private static boolean isEven(int num){
        return num%2==0;
    }
    private static  void printEvenNumbersInListStructureInFunctionalApproach(List<Integer>numbers){
//        numbers.stream().filter(Main::isEven).forEach(System.out::println);
//        numbers.stream().filter(number->number%2==0).forEach(System.out::println);  // Lambda Expression
    }

    private static void printOddNumbersInListStructureInFunctionalApproach(List<Integer> numbers){
//        numbers.stream().filter(number->number%2!=0).forEach(System.out::println);
    }

    private static void printAllCoursesInListStructureInFunctionalApproach(List<String> courses){
//          courses.stream().forEach(System.out::println);
    }

    private static void printAllCoursesContainingSpringInListStructureInFunctionalApproach(List<String> courses){
//        courses.stream().filter(course->course.contains("Spring")).forEach(System.out::println);
    }

    private static void printAllCoursesContainingAtLeast4LettersInListStructureInFunctionalApproach(List<String> courses){
//        courses.stream().filter(course->course.length()>=4).forEach(System.out::println);
    }

    private static void printSquaresOfNumbersInListStructureInFunctionalApproach(List<Integer> numbers){
//        numbers.stream().map(number->number*number).forEach(System.out::println);
    }

    private static void printSquaresOfEvenInListStructureInFunctionalApproach(List<Integer> numbers){
//        numbers.stream().filter(number->number%2==0).map(number->number*number).forEach(System.out::println);
    }

    private static void printNumberOfCharacterWithCourseName(List<String> courses){
//        courses.stream().map(course->course + " " + course.length()).forEach(System.out::println);
    }

    private static void printFruitsStartWithB(List<String> fruits) {
        Predicate<? super String>predicate = fruit -> fruit.startsWith("b");
        Optional<String> optional = fruits.stream().filter(predicate).findFirst();
        System.out.println(optional.get());

    }

}