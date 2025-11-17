package com.tnsif.streamapiprograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// demo with stream api

public class Withstreamapi {
	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,7,8,9,10); // stream of data
		List<Integer> result=numbers.stream()// create a stream from the list
				.filter(n->n%2==0) // keep the even numbers
				.map(n->n*2) // doubled that number
				.sorted() // sort the numbers
				.collect(Collectors.toList()); // terminal: collect the results into a list
		System.out.println(result); // output
	}

}

