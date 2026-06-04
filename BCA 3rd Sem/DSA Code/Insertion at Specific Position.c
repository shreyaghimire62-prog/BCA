#include <stdio.h>
#include <stdlib.h>

struct node {
    int data;
    struct node *next;
};

// insert at specific position
struct node* insertAtPos(struct node *head, int value, int pos)
{
    struct node *newNode = (struct node*)malloc(sizeof(struct node));
    if(newNode == NULL)
        return head;

    newNode->data = value;

    // insert at beginning
    if(pos == 1)
    {
        newNode->next = head;
        return newNode;
    }

    struct node *temp = head;
    int i;

    for(i = 1; i < pos - 1 && temp != NULL; i++)
        temp = temp->next;

    // invalid position
    if(temp == NULL)
    {
        free(newNode);
        return head;
    }

    newNode->next = temp->next;
    temp->next = newNode;

    return head;
}

// display linked list
void display(struct node *head)
{
    while(head != NULL)
    {
        printf("%d -> ", head->data);
        head = head->next;
    }
    printf("NULL\n");
}

int main()
{
    struct node *head = NULL;

    head = insertAtPos(head, 10, 1);  // 10
    head = insertAtPos(head, 20, 2);  // 10 20
    head = insertAtPos(head, 30, 3);  // 10 20 30
    head = insertAtPos(head, 15, 2);  // 10 15 20 30

    display(head);

    return 0;
}

