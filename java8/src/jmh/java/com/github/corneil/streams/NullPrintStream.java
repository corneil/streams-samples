package com.github.corneil.streams;

import org.openjdk.jmh.util.NullOutputStream;

import java.io.PrintStream;

public class NullPrintStream extends PrintStream {
	public NullPrintStream() {
		super(new NullOutputStream());
	}
}
