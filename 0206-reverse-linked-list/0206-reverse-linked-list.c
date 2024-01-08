/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* reverseList(struct ListNode* head) {
    struct ListNode *slow = NULL;
    struct ListNode *current = head;
    struct ListNode *fast = NULL;
    if(head == NULL || head->next == NULL) {
        return head;
    }
    while(current != NULL) {
        fast = current->next;
        current->next = slow;
        slow = current;
        current = fast;
        
    }
    return slow;
}