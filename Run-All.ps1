gci *.class -File | %{ 
	"> $($_.Name)"; 
	java -cp . $_.BaseName;
	'----------';
}

java -cp '.;json-20250107.jar' json

