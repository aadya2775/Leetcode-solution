import java.util.*;
public class q876 {
public static class ListNode {
         int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; 
        }
     }
     ListNode head=null;
    public static ListNode middleNode(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode fast = head;
        ListNode slow = head;
    
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }     
       public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number of elements in the linked list =");
            int n = scanner.nextInt();
            ListNode head = null;
          for (int i = 0; i < n; i++) {
                int val = scanner.nextInt();
                ListNode newNode = new ListNode(val);
                if (head == null) {
                    head = newNode;
                } else {
                    ListNode temp = head;
                    while (temp.next != null) {
                        temp = temp.next;
                    }
                    temp.next = newNode;
                }
            }
            ListNode mid =middleNode(head);
            System.out.println(mid.val);
            scanner.close();
    }
}


