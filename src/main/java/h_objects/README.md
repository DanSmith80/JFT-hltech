## Objects

### Methods (objects)
#### Task 1 - Classes
1. Create a public Shape class with properties:
* public int width
* public int height

#### Task 2 - Classes
1. Create a public Rectangle class that inherits from Shape
2. Create a public int getArea() method in it that returns the area (width * height)


#### Task 3 - Classrooms
1. Create a public Paint class that inherits from Rectangle
2. Create a getPrice() method in it that returns the price (area * EURO 400/m2)


#### Task 4 - we play with objects
1. Create a Paint object
2. Set its height and width
3. Display its price

#### Task 5 - constructors
1. Create a Paint class constructor that requires height and width
2. Correct the previous task


#### Task 6 - Interfaces
1. Create an IPriceable interface that defines getPrice()
2. Modify the Paint class to implement the IPriceable interface
3. Comment out the temporarily written getPrice method in the Paint class and see what happens


#### Exercise 7 - Interfaces
1. Create an instance of the Paint class
2. Create an instance of the IPriceable interface
3. Call .getPrice() methods on them