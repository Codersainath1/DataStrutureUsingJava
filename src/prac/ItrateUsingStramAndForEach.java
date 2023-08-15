package prac;

import java.util.stream.*;

public class ItrateUsingStramAndForEach {
    public static void main(String...args)
    {
    	 Stream.iterate(2, count->count+1)
    	 .filter(count->count%2==0).limit(5).forEach(System.out::println);;
    }

	
}
