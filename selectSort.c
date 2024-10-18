#include <stdio.h>
#include <stdlib.h>
void main()
{
    int n, *p, i, j, *key, temp;
    printf("\n");
    printf("enter the size of array--->");
    scanf("%d", &n);
    p = (int *)malloc(n * sizeof(int));
    printf("enter the elements of array\n");
    for (i = 0; i < n; i++)
        scanf("%d", (p + i));
    printf("\n");
    // selection sort of array begins

    for (i = 0; i < n - 1; i++)
    {
        key = p + i;
        for (j = i; j < n; j++)
        {
            if (*(p + i) > *(p + j))
                key = p + j;
        }
        temp = *(p + i);
        *(p + i) = *key;
        *key = temp;
    }
    printf("the sorted array is \n");
    for (i = 0; i < n; i++)
        printf("%d  ", *(p + i));
}