package com.xxx;

public class test {
//xxx

	public static void main(String[] args) {
		String[] c = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
		int sum = 0;
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length(); j++) {
				char x = c[i].charAt(j);
				switch (x) {
				case 'a':
					sum++;
					break;
				case 'e':
					sum++;
					break;
				case 'i':
					sum++;
					break;
				case 'o':
					sum++;
					break;
				case 'u':
					sum++;
					break;
				default:
					break;
				}
			}
		}
		System.out.println(sum);
	}
}
