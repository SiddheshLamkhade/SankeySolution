# Sankey Solution – Task 1
## Student Attendance Management System (Java)

This project is a console-based Java application developed as Task 1 for Sankey Solution.
It demonstrates the use of basic data structures to manage student attendance efficiently.

## Problem Statement

Design a simple system to manage student attendance using core data structures.

The system should:
- Store student IDs in the order they enter
- Check whether a student is present
- Undo the last marked attendance
- Display all present students

## Features

- Add student attendance without duplicates
- Check student presence using ID
- Undo last attendance entry
- Display attendance list in arrival order
- View total present students
- Clear all attendance records
- Menu-driven console interaction

## Data Structures Used

Queue (LinkedList) – Maintain student entry order  
HashSet – Fast presence check and duplicate prevention  
Stack – Undo last attendance  
ArrayList – Display attendance records  

## How It Works

1. Add Attendance  
   Student ID is added only if it is not already present.

2. Check Attendance  
   Verifies whether the given student ID is present.

3. Undo Attendance  
   Removes the most recently marked attendance.

4. Show Attendance  
   Displays all present students in the order they arrived.

## Technologies Used

- Java
- Java Collections Framework
- Console-based Input/Output

## How to Run

1. Clone the repository
2. Open the project in any Java IDE or terminal
3. Compile and run StudentAttendanceSystem.java
4. Follow the menu options in the console

