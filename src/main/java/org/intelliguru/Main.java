package org.intelliguru;

public class Main {
    public static void main(String[] args) {
//        MergeTwoSortedList.ListNode list1 = createLinkedList(new int[]{1, 2, 4});
//        MergeTwoSortedList.ListNode list2 = createLinkedList(new int[]{1, 3, 4});
//
//        MergeTwoSortedList mts = new MergeTwoSortedList();
//        MergeTwoSortedList.ListNode listNode = mts.mergeTwoLists(list1, list2);


        String haystack = "sadbutsad", needle = "sad";
        IndexOfFirstOccurrenceInString07 inString = new IndexOfFirstOccurrenceInString07();
        int i  = inString.haystackNeedle(haystack, needle);
    }

//    private static MergeTwoSortedList.ListNode createLinkedList(int[] values) {
//        if (values == null || values.length == 0) {
//            return null;
//        }
//        MergeTwoSortedList.ListNode head = new MergeTwoSortedList.ListNode(values[0]);
//        MergeTwoSortedList.ListNode current = head;
//        for (int i = 1; i < values.length; i++) {
//            current.next = new MergeTwoSortedList.ListNode(values[i]);
//            current = current.next;
//        }
//        return head;
//    }
}