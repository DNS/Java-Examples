gci *.class -File | %{ 
	"> $($_.Name)"; 
	java -cp . $_.BaseName;
	'----------';
}
