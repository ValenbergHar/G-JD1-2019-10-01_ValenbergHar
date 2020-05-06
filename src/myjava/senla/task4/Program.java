package senla.task4;

class Program {
	// not case sensitive
	static boolean isPalindrome(int k) {
		String s = String.valueOf(k);
		for (int i = 0, j = s.length() - 1; i < s.length() / 2; i++, j--) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
		}

		return true;
	}
}
