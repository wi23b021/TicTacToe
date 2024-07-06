# TicTacToe

A simple command-line TicTacToe game implemented in Java.

## Table of Contents

- [Project Overview](#project-overview)
- [Features](#features)
- [How to Play](#how-to-play)
- [Game Rules](#game-rules)
- [Example Gameplay](#example-gameplay)
- [Project Structure](#project-structure)
- [Acknowledgements](#acknowledgements)

## Project Overview

TicTacToe is a classic two-player game where players take turns marking spaces in a 3x3 grid. The player who succeeds in placing three of their marks in a horizontal, vertical, or diagonal row wins the game.

This project is designed to provide a simple example of a command-line application using Java. It includes basic object-oriented programming concepts and demonstrates how to use Maven for project management.

## Features

- Two-player game (Player X and Player O)
- Command-line interface
- Detects win and draw conditions
- Allows players to start a new game after a win or draw
- Simple and clean code structure

## How to Play

1. *Start the game*:
   - Run the game using the command:
     sh
     mvn compile exec:java -Dexec.mainClass="org.example.Main"
     
2. *View the board*:
   - The game will display the current state of the board.


3. *Make a move*:
   - Players take turns to make a move.
   - Player X goes first.
   - You will be prompted to enter the row and column where you want to place your marker.
     
     Current Player: X
     Enter row (0-2): 1
     Enter column (0-2): 1
     

4. *Check the board*:
   - After each move, the game will update and display the board.
       

5. *Win, Lose, or Draw*:
   - The game will detect if there is a winner or if the game ends in a draw.
   - If a player wins:
     
     Current Player: X
     Enter row (0-2): 0
     Enter column (0-2): 0

     Player X wins!
     
   - If the game is a draw:
     
     Current Player: O
     Enter row (0-2): 2
     Enter column (0-2): 2
    
     It's a draw!
     

6. *Start a new game*:
   - After the game ends, you will be prompted to start a new game.
     
     Do you want to play again? (y/n): y
     

## Game Rules

- The game is played on a 3x3 grid.
- Player X always goes first.
- Players take turns placing their markers (X or O) on the board.
- The first player to get three of their markers in a row (horizontally, vertically, or diagonally) wins.
- If all nine squares are filled and neither player has three in a row, the game is a draw.
