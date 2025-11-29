Banking System Console by Java

A fully functional console based Banking System built in Java using Object-Oriented Programming, supporting secure PIN access, deposits, withdrawals, balance checks, and transaction history.

This is part of my Backend Development Roadmap  built step-by-step while learning & applying real banking logic.


 Feature Description 

 Create Account ; Unique account number, holder name, starting balance, PIN 
 PIN Authentication ;  Every action requires correct PIN for security 
 Deposit Money ; Safely add funds to account 
 Withdraw Money ; Prevents overdraft  balance cannot go below zero 
 Check Balance ; Shows current account balance instantly 
 View Transaction History ; Tracks every operation (deposit, withdraw, creation) 
 Error Proof Input ; Handles invalid numbers safely (no crashing) 



 Project Structure

text
src/
 Account.java       -> Manages deposits, withdrawals, history, PIN authentication
 Bank.java          -> Stores accounts, verifies PIN, manages access
  BankApp.java       -> Main program - user menu & console interaction
