## Access modifiers

#### Excercise 1
In class `AccessModifiers.cs` create class variables as below (don't create main function there)
1. private static String movie
2. protected static String writer
3. public static double budget
4. static String actor

and set valid values to them.


#### Task 2
1. In the `TestModifiers.cs` class, write code to set those four variables
```java
public class TestModifiers {
    public static void main(String[] args) {
        AccessModifiers.writer = "Stephen King";
    }
}
```
2. Which one were you able to set?
3. Move the class (drag & drop) to other package (g_regex) for example. Any change?


#### Task 3 - getters and setters
1. Create a User class with a private `int age` field;
2. Write a public method (setter) to it that sets the age value, but only if the given age is in the range <1, 150>
3. Write a public method (getter) for it that retrieves the age value from the private field
4. Uncomment code in `GettersAndSetters` class and run it. What's the output?
