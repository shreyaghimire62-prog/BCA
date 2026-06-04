#include <stdio.h>
#include <stdlib.h>

struct node {
    int data;
    struct node *next;
};

struct node* insertBegin(struct node *head, int value)
{
    struct node *newNode = (struct node*)malloc(sizeof(struct node));

    if(newNode == NULL)
        return head;

    newNode->data = value;
    newNode->next = head;
    head = newNode;

    return head;   // ?? mistake fixed here
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

    head = insertBegin(head, 10);
    head = insertBegin(head, 20);
    head = insertBegin(head, 30);

    display(head);

    return 0;
}

