Area Calculator – Java Project

A simple Java console-based program that calculates the area of different geometric shapes.
The user can choose from rectangle, square, triangle, circle, and ellipse.
The program loops until the user chooses to stop.

✨ Features

Calculate area of:

Rectangle

Square

Triangle

Circle

Ellipse

Clean function-based structure

Scanner input handling

Repeats until user exits

📌 How It Works

User enters the shape name (rect, squa, tri, cir, elli)

Program asks for required dimensions

Area is calculated and displayed

User chooses whether to continue

🧮 Supported Formulas

Rectangle: area = width × length

Square: area = side²

Triangle: area = ½ × base × height

Circle: area = π × r²

Ellipse: area = π × a × b

📂 Project Structure
AREACALCULATOR.java

▶️ How to Run

Compile:

javac AREACALCULATOR.java


Run:

java AREACALCULATOR

📘 Example Input
enter the input among(rect, squa, tri, cir, elli)
rect
enter the width of the rectangle
10
enter the length of the rectangle
20
the area of rectangle is : 200.0

⚠️ Common Errors (and fixes already applied)

nextline() → corrected to nextLine()

Two back-to-back nextLine() after reading a string — removed unnecessary one

Fixed scanner cleanup logic

Fixed spelling issues

Ensured clean looping

🛠️ Requirements

Java 8+

Works in any IDE or terminal
