# java-basics-projects
Small Java projects to practise programming fundamentals.
# Student Marks Calculator

A Java console application that reads a student's name and marks in five subjects, then calculates their total, percentage, result, and grade.

## Features

- Accepts marks for Maths, English, Science, Hindi, and Computer.
- Validates that each mark is between 0 and 100.
- Lets the user retry invalid marks.
- Calculates total marks out of 500 and percentage.
- Requires at least 35 marks in every subject to pass.
- Assigns grades based on percentage; failing any subject results in Grade F.
- Supports multiple students during one run.

## What I Learned

- Reading keyboard input using `Scanner`.
- Using `String`, `int`, and `double` variables.
- Calculating totals and percentages.
- Understanding integer division versus decimal division.
- Using `if`, `else if`, and nested conditions.
- Using `||` for OR and `&&` for AND.
- Using `while` loops for input validation.
- Using a `do-while` loop to repeat the program.
- Comparing text using `equalsIgnoreCase()`.
- Handling the newline left after `nextInt()`.
- Testing boundary values such as 0, 35, and 100.

## How to Run

With a JDK installed, open a terminal in this project's folder:

```text
javac src/Main.java
java -cp src Main
```

Alternatively, open the project in IntelliJ IDEA and run `Main.main()`.

## Limitations

- Marks must be entered as whole numbers. Non-numeric input is not handled yet.
- Results are displayed in the terminal and are not saved.

## Status

Complete — the planned features and multiple-student challenge are implemented.
