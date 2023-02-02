package Test1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Scanner;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class Maths1 {

	@Test(groups = { "Smoke" })
	public void m1() {
		System.out.println("m1");
		String[] a = { "ab", "bc", "cd" };
		String[] b = { "de", "ef", "fg" };
		Stream<String> total1 = Arrays.stream(a);
		Stream<String> total2 = Arrays.stream(b);
		String full[] = Stream.concat(total1, total2).toArray(size -> new String[size]);
		for (String s : full) {
			System.out.println(s);
		}

		int[] ab = { 1, 2, 3, 4, 52, 3, 4 };
		IntStream sf = Arrays.stream(ab);
		System.out.println(sf.average());

		Scanner sd = new Scanner(System.in);
		String af = sd.next();
		int cont = 0;
		for (int q = 0; q < af.length(); q++) {
			if (af.charAt(q) == 'a' || af.charAt(q) == 'e' || af.charAt(q) == 'i' || af.charAt(q) == 'o'
					|| af.charAt(q) == 'u') {
				System.out.println(af.charAt(q) + " " + cont);
				cont++;
			}
		}

	}

	@Test
	public void m2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the number");
		String i = sc.next();
		String a = "ar";

		System.out.println("m2--");
		char[] ch = i.toCharArray();
//		 List<char[]> asList = Arrays.asList(ch); // because this DOES compile.

		List<Character> listC = new ArrayList<Character>();
		for (char c : ch) {
			listC.add(c);
		}

		if (i.contains("a")) {
			System.out.println("Hello");
		}
		if (i.matches("(.*)" + a + "(.*)")) {
			System.out.println("Hello  " + i);
		}
		System.out.println(listC);
		for (int j = 0; j < i.length(); j++) {
			System.out.println(i.charAt(j));

		}

		try {
			int l = 10 / 0;
			System.out.println("i");
		} catch (ArithmeticException ae) {
			System.out.println("is a error");
		} finally {
			System.out.println("value is correct");
		}

	}

	@Test
	public void str() {
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(2);
		ar.add(3);
		ar.add(1);
		ar.add(2);
		// List<Integer> li=Arrays.asList(str);
		ar.stream().distinct().sorted().forEach(s -> System.out.println(s));
		System.out.println(":::::::::::::::::::::::::");
		String sg="Testing Solution";
		long co= sg.chars().filter(e-> (char)e=='i').count();
		System.out.println("\"hello\""+co);
	}

}
