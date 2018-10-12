package com.in28minutes.springboot.basics;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book {
	Long id;
	String name;
	String author;
	
}
