package com.github.corneil.streams;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Streams8Examples {
	public static void m1(final List<String> strings, final PrintStream out) {

		final List<String> result = new ArrayList<>(strings.size());

		for (String s : strings) {
			if (s.startsWith("c")) {
				result.add(s.toUpperCase());
			}
		}
		Collections.sort(result);
		for (String s : result) {
			out.println(s);
		}

	}

	public static void m2(final List<String> strings, final PrintStream out) {

		strings.stream()
			.filter(s -> s.startsWith("c"))
			.map(String::toUpperCase)
			.sorted()
			.forEach(out::println);

	}

	public static void main(String[] args) {
		final List<String> strings = Arrays.asList("a1", "a2", "b1", "c2", "c1");
		System.out.println("\nM1 ---");
		m1(strings, System.out);
		System.out.println("\nM2 ---");
		m2(strings, System.out);
	}
}