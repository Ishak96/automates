package test;

import java.io.IOException;

import export.TexExport;

public class TestTexExport {
	public static void main(String[] args) throws IOException {
		TexExport lex = new TexExport("test", "/home/ishak/");
		lex.generateFile();
	}
}
