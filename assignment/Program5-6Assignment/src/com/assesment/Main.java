package com.assesment;

import java.util.*;

//Question Number 5 and 6 combined
public class Main {
	public static int fetchCalories(int piz) {
		int cal;

		switch (piz) {
		case 1:
			MargheritaPizza mp = new MargheritaPizza();
			cal = mp.makePizza();
			return cal;
		case 2:
			CheesePizza cp = new CheesePizza();
			cal = cp.makePizza();
			return cal;

		default:
			System.out.println("Invalid");
		}
		return 0;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Select the pizza in which the calories to be known:\n1.Margherita Pizza\n2.Cheese Pizza");
		int piz = sc.nextInt();
		Main m = new Main();
		int cal = m.fetchCalories(piz);
		Nutritionist n = new Nutritionist();
		n.printCalories(cal);

	}
}
