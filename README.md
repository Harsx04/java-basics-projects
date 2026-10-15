# Java Basics Projects

My collection of small Java console projects, built while learning programming through hands-on practice.

## 1. Student Marks Calculator

Reads a student's name and marks in five subjects, then displays their total, percentage, pass/fail result, and grade.

**Features**
- Validates marks between 0 and 100 and allows retries.
- Requires at least 35 in every subject to pass.
- Calculates total, percentage, and grade.
- Supports multiple students in one run.

**What I learned**
- Input using `Scanner`.
- Variables, data types, and arithmetic.
- Integer division versus decimal division.
- Conditions and logical operators.
- `while` and `do-while` loops.
- String comparison using `equalsIgnoreCase()`.

## 2. Menu-Based Calculator

Performs addition, subtraction, multiplication, and division through a repeating menu.

Includes two versions:
- **Basic version:** calculations inside the menu cases.
- **Methods version:** separate methods for each calculation.

**Features**
- Accepts decimal numbers.
- Handles division by zero.
- Displays a message for invalid menu choices.
- Repeats until the user chooses Exit.

**What I learned**
- Menu selection using `switch`, `case`, `break`, and `default`.
- Reading decimal input using `nextDouble()`.
- Repeating a menu using `do-while`.
- Creating and calling static methods.
- Parameters, arguments, return values, and variable scope.

## Running the Projects

With a JDK installed, open a terminal in the folder containing the version's `Main.java`, then run:

```text
javac Main.java
java Main
```

For the Student Marks Calculator, this is its `src` folder.

Alternatively, run each project separately in IntelliJ IDEA.

## Current Limitation

Both projects expect numeric input when requesting numbers. Handling text entered in place of a number is not implemented.

## 3. Number Guessing Game

A Java console game where the player has seven attempts to guess a randomly generated number between 1 and 100.

**Features**
- Generates a random secret number for each run.
- Gives “Too High” and “Too Low” hints.
- Counts guesses and limits the player to seven attempts.
- Ends immediately when the player guesses correctly.
- Reveals the secret number when the player loses.

**What I learned**
- Generating numbers using `Random` and `nextInt()`.
- Creating a random number within a specific range.
- Tracking attempts using a counter and `++`.
- Tracking the outcome using a `boolean`.
- Using `!` to negate a boolean condition.
- Using `break` to exit a loop.
- Keeping variables outside a loop so their values persist between iterations.

**Limitations**
- Expects whole-number input; non-numeric input is not handled.
- Guesses outside 1–100 are accepted and count as attempts.
