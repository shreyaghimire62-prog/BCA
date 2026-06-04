#include <stdio.h>
#include <stdlib.h>   // ?? REQUIRED for NULL, free, malloc

struct node {
    int data;
    struct node *next;
};

// delete node at end
struct node* deleteEnd(struct node *head)
{
    if(head == NULL)
        return NULL;

    // only one node
    if(head->next == NULL)
    {
        free(head);
        return NULL;
    }

    struct node *temp = head;

    while(temp->next->next != NULL)
        temp = temp->next;

    free(temp->next);
    temp->next = NULL;

    return head;
}

// display list
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

    // manually creating list
    head = (struct node*)malloc(sizeof(struct node));
    head->data = 10;
    head->next = (struct node*)malloc(sizeof(struct node));
    head->next->data = 20;
    head->next->next = (struct node*)malloc(sizeof(struct node));
    head->next->next->data = 30;
    head->next->next->next = NULL;

    printf("Before Deletion:\n");
    display(head);

    head = deleteEnd(head);

    printf("After Deletion:\n");
    display(head);

    return 0;
}

