#include <stdio.h>
#define P printf
#define S scanf
void main()
{
    int a;
    P("enter a number-->");
    S("%d", &a);
    int fac = 1;
    while (a > 0)
        fac *= a--;
    P("the factorial is %d", fac);
}