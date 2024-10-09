#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.util;

public class TestUtil {

	/**
	 * Verilen String ifadenin ilk ve bosluktan sonraki harfini buyuk harf yapar.
	 * 
	 * @param name
	 * @return
	 */
	public static String uppercaseOfNames(String name) {

		if (name == null || name.trim().length() == 0) {
			return "No-Name";
		}

		char[] modified = new char[name.length()];
		char[] chars = name.toCharArray();
		boolean mustUpper = true;
		for (int i = 0; i < chars.length; i++) {
			modified[i] = mustUpper ? (chars[i] + "").toUpperCase().charAt(0) : chars[i];
			mustUpper = Character.isWhitespace(chars[i]);
		}
		return new String(modified);
	}
}
