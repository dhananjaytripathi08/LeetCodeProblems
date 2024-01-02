/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* removeNthFromEnd(struct ListNode* head, int n) {
    struct ListNode *temp, *target = NULL;
    int count = 0;
    int i = 1;
    temp = head;
    while(temp != NULL) {
        count = count + 1;
        temp = temp->next;
    }
    temp = head;
    if(count == 1) {
        head = NULL;
        return head;
    }
    else {
        while(i < (count-n)) {
            i++;
            temp = temp->next;
        }
        if(count == n) {
            target = temp;
            head = temp->next;
        }
        else {
            target = temp->next;
            temp->next = target->next;
        }
    }
    free(target);
    return head;
}