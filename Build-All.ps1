gci *.java -File | %{ javac -encoding UTF8 $_ }
javac -cp '.;json-20250107.jar' json.java
