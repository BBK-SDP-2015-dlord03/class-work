package reflection;

import java.lang.reflect.Method;
import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {

		try (Scanner in = new Scanner(System.in)) {

			System.out.print("Enter class name: ");
			String className = in.nextLine();

			try {
				Class<?> c = Class.forName(className);
				/*
				System.out.format("Methods for class \"%s\":%n", c.getName());
				Method[] m = c.getDeclaredMethods();

				for (Method method : m) {
					System.out.println(method);
				}
				*/
				Object obj = c.newInstance();
				System.out.println(obj);
				
				
			} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
				System.err.format("Something went wrong [%s].%n", e.getMessage());
				e.printStackTrace(System.err);
			}
		}
	}

}