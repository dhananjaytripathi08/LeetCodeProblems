/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* deleteDuplicates(struct ListNode* head) {
    if(head == NULL || head->next == NULL) {
        return head;
    }
    else {
        struct ListNode *slow = head;
        struct ListNode *fast = head->next;
        while((slow->next != NULL) && (fast != NULL)) {
            if(slow->val != fast->val) {
                slow = slow->next;
                fast = fast->next;
            }
            else {
                fast = fast->next;
                slow->next = fast;
            }
        }
    }
    return head;
}