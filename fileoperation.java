import java.nio.file.*;
import java.util.*;

public class fileoperation {
	static Path file_path = Paths.get("EXAMPLE.TXT");
	static List<String> first_line = List.of("AAA", "BBB");
	static List<String> add_more = List.of("CCC", "DDD");
	
	
	public static void main(String args[]) throws Exception {
		write_file();
		append_file();
		read_file();
	}
	
	
	
	static void write_file () throws Exception {
		Files.write(file_path, first_line);
	}
	
	static void append_file () throws Exception {
		Files.write(file_path, add_more, StandardOpenOption.APPEND, StandardOpenOption.CREATE);
	}
	
	static void read_file () throws Exception {
		String content = Files.readString(file_path);
		System.out.print(content);
	}
}









