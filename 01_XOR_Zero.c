#include <stdio.h>

int main(void) {
    char text[] = "Hello world";
    int i;

    printf("Result: ");
    for (i = 0; text[i] != '\0'; i++) {
        printf("%c", text[i] ^ 0);
    }
    printf("\n");

    return 0;
}
