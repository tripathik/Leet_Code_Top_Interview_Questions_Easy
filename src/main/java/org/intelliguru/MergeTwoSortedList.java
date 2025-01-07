package org.intelliguru;

public class MergeTwoSortedList {
    public static class ListNode{
        int value;
        ListNode next;
        ListNode(){}
        ListNode(int value){
            this.value = value;
        }
        ListNode(int value, ListNode next){
            this.value = value;
            this.next = next;
        }
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        while(list1 !=null && list2!= null){
            if(list1.value <= list2.value){
                current.next = list1;
                list1 = list1.next;
            }else{
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        if(list1 != null){
            current.next = list1;
        }else {
            current.next = list2;
        }
        return dummy.next;
    }
}


