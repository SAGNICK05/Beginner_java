#include <stdio.h>
#define P printf
#define S scanf
void main()
{
    int a, *p, fac = 1;
    p = &a;
    P("enter the number");
    S("%d", p);
    while (*p > 0)
    {
        fac *= *p;
        *p--;
    }
    P("the factorial is %d", fac);
}