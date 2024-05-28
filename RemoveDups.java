
import java.util.HashSet;

public class RemoveDups {

    public static void main(String[] args) {
        System.out.println("hi");
    }

    // Runtime O(N)
    public static void solution(ListNode head) {
        ListNode prev = null;
        HashSet<Integer> set = new HashSet<>();

        while (head != null) {
            if (set.contains(head.val)) {
                // remove the dup 
                prev.next = head.next;
            } else {
                prev = head;
                set.add(head.val);
            }
            head = head.next;
        }

    }
    
    // no buffer allowed solution 
    // Space O(1) Runtime O(N^2)
    public static void solution2(ListNode head) {
        ListNode curr = head;
        while(curr != null) {
            ListNode runner = curr;
            while(runner.next != null) {
                if (runner.next.val == curr.val) {
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }
            curr = curr.next;
        }
    }
}
