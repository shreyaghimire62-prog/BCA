struct node* deleteAtPos(struct node *head, int pos)
{
    if(pos == 1)
    {
        struct node *temp = head;
        head = head->next;
        free(temp);
        return head;
    }

    struct node *temp = head;
    for(int i = 1; i < pos-1 && temp->next != NULL; i++)
        temp = temp->next;

    struct node *del = temp->next;
    temp->next = del->next;
    free(del);
    return head;
}

