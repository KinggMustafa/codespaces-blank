Step 1: Clone the Repo
clone the project repository. You can do this by running the git clone <repository-link> cmd, which will download the project to your system

Step 2: Upload to GitHub Codespace
Once the repository has been cloned, open the project folder within a GitHub Codespace in the blank environment template, ensuring that the folder structure remains intact.

Step 3: Navigate to the Project Directory
Next, in the GitHub Codespace terminal, change the directory to the project folder by typing cd "project-directory"

Step 4: Compile the Java Files
In the terminal, you will need to compile all the Java source files located in the src/c/ directory under Lab1. To do this, use the command:
javac -d out src/c/*.java. 
This will compile the files and place the output into the out/ folder.

Step 5: Compile the JUnit Test Files
After compiling the main Java files, compile the JUnit test file HybridTest.java. You can achieve this by running the command: 
javac -d out -cp out:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar src/u/HybridTest.java


Step 6: Run the JUnit Test
Run the JUnit test, execute the command:
java -cp out:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore u.HybridTest. 
This will execute the test cases and output the results to the terminal
