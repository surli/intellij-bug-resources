# intellij-bug-resources

This repository aims at reproducing a bug in IntelliJ when multiple module-info.java are contained in resources directory. 

To reproduce the bug: just import this project in IntelliJ and try to build it. 
Then type `mvn test` to show that the code should built.
