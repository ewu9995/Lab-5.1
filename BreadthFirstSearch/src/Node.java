
public class Node {

	public String cityName;
	Node leftChild;
	Node rightChild;
	
	public Node(String cityName, Node firstChild, Node secondChild)
	{
		this.cityName = cityName;
		this.leftChild = firstChild;
	}
	
}
