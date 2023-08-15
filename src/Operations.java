
public class Operations {

	public TraiNode getroot() {
		TraiNode root = new TraiNode('0');
		return root;
	}

	public void add(String str) {
		TraiNode root = getroot();
		getHalper(root, str);
		System.out.println("data aaded successfully");
	}

	private void getHalper(TraiNode root, String str) {
		if (str.length() == 0) {
			root.isTermination = true;
			return;
		}

		int childIndex = str.charAt(0) - 'A';
		TraiNode child = root.childrNodes[childIndex];
		if (child == null) {
			child = new TraiNode(str.charAt(0));
			root.childrNodes[childIndex] = child;
		}

		getHalper(child, str.substring(1));
	}

	public static void main(String... str) {
		Operations opt = new Operations();
		opt.add("KUMAR");
	}
}
