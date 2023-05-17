## Exceptions

#### Task 1
1. Run the program in the `OurExceptions.cs` class
2. Why the inscription `And this should be printed regardless of everything` was not printed?
3. Without changing the value of `b` or the calculations of the variable `c`, correct the program so that the above string is printed.


#### Exercise 2
1. Enter the class `ThrowExceptions.cs` and see the application code
2. Correct the `getMaxElement()` method so that it *throws* an `IllegalArgumentException` if the length of the array passed as a parameter is 0 (the array is empty)
3. Correct the code of the `main()` method so that the application starts and prints information about the empty array passed as a parameter.

#### Exercise 3
1. Correct `TryCatchFinally.java` - make sure that string `This should always be printed.` is always printed no matter what.
2. Add proper exception handling.

Hint: you can use multiple catch blocks
```java
try {
    System.out.println(a.length());
} catch(IllegalArgumentException ex) {
    System.out.println("Exception has been caught");
} catch(SomeOtherException ex) {
    System.out.println("Other exception has been caught");
} catch(YetAnotherException ex) {
    System.out.println("Yet another exception has been caught");
}
```