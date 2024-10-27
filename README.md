"# vttp5_sdf_day09" 
what is readutf in buffered reader
do we need constructors/getters setters when separating methods

# Build and run 

in proj root folder i.e. project01am
To compile
javac -d bin --source-path . ./*.java Card*.java

To run compile bytecode (.class) main entry point
java -cp bin project01am.App

To package jar file, go into bin folder
jar -c -v -f day09.jar -e project01am.App .

To run jar file inside bin folder where the jar is created.
java -jar day09.jar 

outside bin is
java -jar bin/day09.jar

javac -d classes --source-path . src/Task10/*.java
java -cp classes Task10.App

javac -d classes --source-path . src/Task11/*.java
java -cp classes Task11.CardMain

