package someQst;

public class detectAndRemoveLL {
	public static void main(String[] args) {

	}
	
	public boolean detectLoop(Node h1) {
		
		Node slow = h1;
		Node fast = h1;
		
		while(fast != null  && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			
			if (slow != fast) {
				removeLoop2(slow, h1);
				return true;
			}
			
		}
		
		return false;
	}
	
	public void removeLoop2(Node meet , Node h) {
		Node start = h;
		Node loop = meet;
		
		while(start.next != loop.next) {
			start = start.next;
			loop = loop.next;
			
		}
		loop.next = null;
		
		// Printing 
		Node t = h;
		
		while (t != null) {
			System.out.print(t.data + " ");
			t = t.next;
		}
		System.out.println();
	}
}
