### Definition

A regular expression (shortened as regex or regexp) is a sequence of characters that specifies a search pattern in text.


### Links
For testing regexes:
- https://www.debuggex.com/ (good for testing and drawing)
- https://regex101.com/ (good for testing and writing)

#### Task 1 - working with files
Files class documentation: https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/file/Files.html

1. Create a text file (with .txt extension) in the `/resources/textfiles` directory and paste the content below
```text
A mountain bike in Poland costs 2042.23PLN.
A computer in USA costs 2 500.00$.
A car in Germany costs 35000.00€.
A beer in the shop costs 3PLN.
```
2. Read the file into memory using the readAllLines instruction

#### Task 2 - searching for text in files
Pattern class documentation: https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/regex/Pattern.html
Matcher class documentation: https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/regex/Matcher.html

1. In the loaded file, search using regular expressions:
   * all amounts
   * all countries
   * all items
2. Print these items in the console
