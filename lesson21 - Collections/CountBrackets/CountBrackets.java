package brackets;

import java.util.Stack;

public class CountBrackets {

	public static void main(String[] args) {
		
		String code = "dshajd { njda}, dsd {dskd { {dsdsd} dsd}}";
		
		System.out.println(isValid(code));

	}

	public static boolean isValid(String code) {

		Stack<Character> brackets = new Stack<Character>();

		for (int index = 0; index < code.length(); index++) {
			if (code.charAt(index) == '{')
				brackets.push('{');

			if (code.charAt(index) == '}') {
				if (brackets.isEmpty()) {
					return false;
				} else {
					brackets.pop();
				}
			}
		}
		if (brackets.isEmpty())
			return true;
		else
			return false;
	}

}
