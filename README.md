# Tic-Tac-Toe-Game

# Overview
* This is a simple command-line Tic Tac Toe game implemented in Java. The game allows two players to play against each other, taking turns to place their marks (X and O) on a 3x3 grid. The first player to get three of their marks in a row (horizontally, vertically, or diagonally) wins the game.

# Features

* Two-player gameplay
* Simple command-line interface
* Input validation
* Detection of win conditions and draw situations
  
# Requirements
Java Development Kit (JDK) 8 or higher

# How to Run

Clone the repository:

sh
Copy code
git clone https://github.com/ShreyanshChoudhary/tic-tac-toe-java.git

cd tic-tac-toe-java

* Compile the Java files:

sh
Copy code
javac TicTacToe.java
Run the game:

sh
Copy code
java TicTacToe

# Gameplay Instructions

The game will prompt player X to enter their move. Players will enter their move by specifying the row and column numbers (both 0, 1, or 2).
After player X makes their move, the game will display the updated board and prompt player O for their move.
The game continues until one player wins by getting three of their marks in a row or until all cells are filled, resulting in a draw.
Example
markdown
Copy code
 0 | 1 | 2
-----------
 3 | 4 | 5
-----------
 6 | 7 | 8

Player X's turn. Enter your move (row and column): 0 0

 X |   |  
-----------
   |   |  
-----------
   |   |  

Player O's turn. Enter your move (row and column): 1 1

 X |   |  
-----------
   | O |  
-----------
   |   |  
   
# Code Structure
TicTacToe.java: Contains the main game logic and user interface.
Board.java: Represents the game board and includes methods for updating and displaying the board.
Player.java: Represents a player and includes methods for making moves and checking for wins.

# Contributing
Contributions are welcome! If you find any bugs or have suggestions for improvements, please create an issue or submit a pull request.
