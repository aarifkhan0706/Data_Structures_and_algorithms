package strings;

//wap to check two strings are anagram or not
public class anagram {
	public static void main(String[] args) {

		String a = "aa#$123b";
		String b = "aba#$32";
		boolean isAnagram = true;
		if (a.length() == b.length()) {

			int al[] = new int[256];// as there are 256 characters
			int bl[] = new int[256];

			for (char c : a.toCharArray()) {
				int index = (int) c;
				al[index]++;
			}

			for (char c : b.toCharArray()) {
				int index = (int) c;
				bl[index]++;
			}

			for (int i = 0; i < 256; i++) {
				if (al[i] != bl[i]) {
					isAnagram = false;
					break;
				}
			}
		} else {
			isAnagram = false;
		}
		if (isAnagram) {
			System.out.println("anagram");
		} else {
			System.out.println("not anagram");
		}
	}
}
