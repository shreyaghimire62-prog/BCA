#include <stdio.h>
#include <string.h>

int main() {
    
    char result[] = "pass"; 

    if (strcmp(result, "pass") == 0) {
        printf("Education is the key to success\n");
    } else {
        printf("A single sheet of paper can't decide my future\n");
    }

    return 0;
}
