import java.util.List;
import java.util.ArrayList;

public class Results implements FileDisplayInterface, StdoutDisplayInterface {

	private List<String> strings;

	/**
	 * @return list of strings
	 */
	public List<String> getStrings() {
		return strings;
	}

	/**
	 * @return nothing
	 */
	public void setStrings(List<String> newStrings) {
		strings = newStrings;
	}

	public Results() {
		strings = new ArrayList<String>();
	}

	/**
	 * @return nothing
	 */
	public void writeToFile(String s) {
	}

	/**
	 * @return nothing
	 */
	public void writeToStdout(String s) {
	}


}
