package prac;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.*;

public class StreamMinMax {

	public static void main(String...args)
	{
		 Integer min= Stream.iterate(3, number->number-2).limit(6).min(Comparator.comparing(Integer::valueOf)).get();
	     System.out.print(min); 
	}
}
