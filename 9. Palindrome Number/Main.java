public class Main {
	public static void main(String[] args) {
		System.out.println(isPalindrome(55));
	}

	public static boolean isPalindrome(int x) {
		if (x < 0 || (x != 0 && x % 10 == 0)) return false;
		int palindrome = 0;
		while(x > palindrome) {
			palindrome = palindrome * 10 + x % 10;
			x /= 10;
		}
		return x == palindrome || x == palindrome / 10;
	}
}
