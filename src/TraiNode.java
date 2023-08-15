
public class TraiNode {
	 public char data;
	 public boolean isTermination;
	 public TraiNode[] childrNodes;
	public TraiNode(char data) {
		super();
		this.data = data;
		this.isTermination = false;
		this.childrNodes = new TraiNode[26];
	}
	 
}
