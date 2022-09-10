package chapter6;

public class CheckerRunner {
	public static void main(String[] args) {
		boolean a, b, c, d;
		SubstringChecker boboChecker = new SubstringChecker("bobo");
		SubstringChecker babaChecker = new SubstringChecker("baba");
		AndChecker bothChecker = new AndChecker(boboChecker, babaChecker);
		NotChecker noBobo = new NotChecker(boboChecker);
		a = boboChecker.accept("bobobobo");
		b = babaChecker.accept("bobobobo");
		c = bothChecker.accept("bababobo");
		d = noBobo.accept("bobobobo");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}
