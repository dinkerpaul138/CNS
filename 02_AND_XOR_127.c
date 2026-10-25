#include <stdio.h>

int main(void) {
    char text[] = "Hello world";
    int i;

    printf("AND result: ");
    for (i = 0; text[i] != '\0'; i++) {
        printf("%c", text[i] & 127);
    }

    printf("\nXOR result (decimal): ");
    for (i = 0; text[i] != '\0'; i++) {
        printf("%d ", ((unsigned char)text[i]) ^ 127);
    }

    printf("\n");
    return 0;
}
