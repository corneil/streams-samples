package com.github.corneil.streams;

import java.io.PrintStream;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class Streams9Examples {
	public static void m1(final String filter, final Collection<String> strings, final PrintStream out) {
		strings.stream()
			.takeWhile(s -> s.startsWith(filter))
			.map(String::toUpperCase)
			.forEach(out::println);
	}

	public static void m2(final String filter, final Collection<String> strings, final PrintStream out) {
		strings.stream()
			.dropWhile(s -> s.startsWith(filter))
			.map(String::toUpperCase)
			.forEach(out::println);
	}

	public static void main(String[] args) {
		List<String> strings = List.of("a1", "a2", "b1", "c2", "c1");
		Set<String> stringSet = Set.of("a1", "a2", "b1", "c2", "c1");

		System.out.println("M1 - c -----");
		m1("c", strings, System.out);

		System.out.println("M1 - a -----");
		m1("a", strings, System.out);

		System.out.println("M1 - c set -----");
		m1("c", stringSet, System.out);

		System.out.println("M1 - a set -----");
		m1("a", stringSet, System.out);


		System.out.println("M2 - c -----");
		m2("c", strings, System.out);

		System.out.println("M2 - a -----");
		m2("a", strings, System.out);

		System.out.println("M2 - c set -----");
		m2("c", stringSet, System.out);

		System.out.println("M2 - a set -----");
		m2("a", stringSet, System.out);
	}
}
