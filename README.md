# number-guessing-game

Number Guess Game Programming Exercise - How to Build
Prerequisites
Java 1.7 or later
Apache Maven 3.x
Assumptions
1) The user chooses number between 0 and 100 only
2) The user chooses a number in his mind and types “ready” to indicate to the computer that he is ready to begin playing. The computer asks a series of questions to arrive at the number the user has in mind. The user can only respond with “higher”, “lower” or “yes”. The game ends when the user responds with “yes” or “end”.
Build
mvn clean install
Run tests
mvn test
Run project from eclipse
com.number.guess.NumberGuessGameApp class has main method which should start playing Game.
Run project using jar
Go to folder where numberguessgame.jar is copied.
java -jar numberguessgame.jar
Sample output:
C:\Users\srilatha\Desktop\assign>java -jar numberguessgame.jar
*******  Welcome to Number Guess Game *********
Computer: Are you ready to play game?. If you are ready, type - ready
ready
Computer: Is the number 50?
lower
User: lower
Computer: Is the number 24?
higher
User: higher
Computer: Is the number 37?
lower
User: lower
Computer: Is the number 30?
yes
User: yes
Computer : I have guessed your number successfully in 4 attempts.





