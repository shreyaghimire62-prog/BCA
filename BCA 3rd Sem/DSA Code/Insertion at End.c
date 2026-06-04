#include <stdio.h>
#include <stdlib.h>

struct node {
    int data;
    struct node *next;
};

struct node* insertEnd(struct node *head, int value)
{
    struct node *newNode = (struct node*)malloc(sizeof(struct node));

    if(newNode == NULL)
        return head;

    newNode->data = value;
    newNode->next = NULL;

    if(head == NULL)
        return newNode;

    struct node *temp = head;
    while(temp->next != NULL)
        temp = temp->next;

    temp->next = newNode;
    return head;
}

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

    head = insertEnd(head, 10);
    head = insertEnd(head, 20);
    head = insertEnd(head, 30);

    display(head);

    return 0;
}

