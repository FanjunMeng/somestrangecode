/**
 * 
 * @author taburiss
 * 在遍历一遍的情况下得到一个长度未知的链表的中间节点
 */
public class GetCenterNodeOfLinkedList {
	
	public static void main(String[] args){
		Node head=createLinkedList(6);
		Node centerNode=getCenterNode(head);
		System.out.println(centerNode);
	}

	/**
	 * 该方法使用两个指针，一个每次向前移动一个节点，另一个每次向前移动两个节点
	 * 当后一个指针移动到链表末尾时，前一个正好移动到中间。
	 * 可以考虑链表长度为偶数时的情况
	 * @return
	 */
	private static Node getCenterNode(Node head) {
		Node p1=head;
		Node p2=head;
		while(p2!=null){
			//首先移动后一个指针，如果长度是奇数，那么后一个指针位于末尾时就不该再移动了
			if (p2.getNext()!=null) {
				p2 = p2.getNext();
				p2=p2.getNext();
			}else{
				break;
			}
			p1=p1.getNext();
		}
		return p1;
	}

	private static Node createLinkedList(int length) {
		Node head=new Node(0);
		Node temp=head;
		for(int i=1;i<length;i++){
			Node next=new Node(i);
			next.setNext(null);
			temp.setNext(next);
			temp=next;
		}
		return head;
	}
}

class Node{
	
	private int index;
	private Node next;
	
	public Node(int index){
		this.index=index;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public int getIndex() {
		return index;
	}
	
	@Override
	public String toString(){
		return ""+index;
	}
}
