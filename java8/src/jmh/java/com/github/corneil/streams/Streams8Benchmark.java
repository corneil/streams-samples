package com.github.corneil.streams;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

@State(value = Scope.Thread)
public class Streams8Benchmark {
	private List<String> strings;
	private PrintStream blackHole;

	@Setup
	public void setup() {
		strings = Arrays.asList("a1", "a2", "b1", "c2", "c1");
		blackHole = new NullPrintStream();
	}

	@Benchmark
	public void m1() {
		Streams8Examples.m1(strings, blackHole);
	}

	@Benchmark
	public void m2() {
		Streams8Examples.m2(strings, blackHole);
	}
}
