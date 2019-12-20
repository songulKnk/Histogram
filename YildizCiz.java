import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

public class YildizCiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
		String kelime = "ben bir garip stringim birden fazla kelimem var tabii bir sürü de harfim var";

		for (int i = 0; i < kelime.length(); i++) {
			hmap.put(kelime.charAt(i), 0);
		}

		for (int i = 0; i < kelime.length(); i++) {
			if (!hmap.containsKey(kelime.charAt(i))) {
				hmap.put(kelime.charAt(i), 0);
			} else {
				int count = (int) hmap.get(kelime.charAt(i));
				hmap.put(kelime.charAt(i), count + 1);
			}

		}

	
		Set<Character> treeSet = new TreeSet<Character>(hmap.keySet());
		Character karakter;
		
		for (karakter = 'a'; karakter <= 'z'; karakter++) {
			System.out.print("\n" + karakter + " : ");
			for (Character chr : treeSet) {

				if (chr.equals(karakter)) {
					// System.out.print("\n" + chr + " :"); // alfabetik olarak sýraladý

					for (int i = 0; i < hmap.get(chr); i++) {
						System.out.print("*");
					}
				}

			}
		}
	}
}