# Lab-A5
This repository contains two programs: Fraction and VotingMachine

The program called Fraction will model a fraction. A Fraction object has only two private instance variables or fields one for the numerator and one for the denominator. The denominator is always positive.
The class has several overloaded constructors
Fraction() - Default constructor that initializes the fraction to 0
Fraction(int n) - Initializes the fraction to n
Fraction(int n, int d) - Initializes the fraction to n/d. Assume that d will never be 0. The fraction is always in reduced form, this is done by calling the method reduce (described below).
Fraction(Fraction other) - Creates a copy of the given fraction, other
The class has accessor and modifier methods
getNumerator() - returns the numerator
getDenominator() - returns the denominator
getValue() - returns the fraction as a double
setNumerator(int n) - modifies the numerator to n
setDenominator(int d) - modifies the denominator to d
setFraction(Fraction other) - copies the given fraction, other
The class has several arithmetic methods
add(Fraction other) - Returns the sum of this fraction and other
add(int m) - Returns the sum of this fraction and m
multiply(Fraction other) - Returns the product of this fraction and other
multiply(int m) - Returns the product of this fraction and m
The class has a method called reduce that reduces the denominator by the greatest common factor (gcf) of the numerator and denominator. For example the fraction 2/6 can be reduced to 1/3 This is done by dividing the numerator and denominator by their greatest common factor, i.e., 2. 
In addition the class has a toString method to convert the fraction to a String. It returns a string of the form numerator/denominator. 











The VotingMachine program has a VotingMachine class that can be used for a simple election. Have methods to clear the machine state, to vote for a Democrat, to vote for a Republican, to vote for an independent to get the tallies for all three parties.
Instance variables for the democrat votes, republican votes and independent votes.
Constructors: There is a default constructor that can create a brand new voting machine without any votes in it as well as a constructor that can accept initial votes for each of the three parties. 
Getter methods for returning the number of votes of each party candidate. The methods must be named getDemocratVotes, getRepublicanVotes, and getIndependentVotes.
Setter methods for changing the number of votes of each party candidate to given numbers. The methods must be named setDemocratVotes, setRepublicanVotes, and setIndependentVotes.
Methods that will increment the votes by 1. Call these methods voteDemocrat, voteRepublican, and voteIndependent.
Overloaded methods, voteDemocrat, voteRepublican, and voteIndependent that will increment the votes by a given amount. The amount of votes to be incremented by will be passed in as parameters.
A method to clear all the votes.
A method to calculate and return the total votes. Call this method totalVotes.
Methods to calculate and return the percent democrat, republican and independent votes. Call the methods percentDemocrat, percentRepublican, and percentIndependent. These methods must call the totalVotes method rather than recalculating it.
A method to print the vote statisitcs. Call this method percentStats. It prints the total votes, percent democrat votes, percent republican votes, and percent independent votes. This method must call the totalVotes, percentDemocrat, percentRepublican , and percentIndependent method rather than recalculating all of the stats.

