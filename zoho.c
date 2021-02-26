#include<stdio.h>
#include <stdlib.h>
#include<string.h>

int main()
{
    char s[100],a[100];
    scanf("%s",s);
    int size,mid,k=0;
    size=strlen(s);
    mid=size/2;
    for(int i=mid;i<strlen(s);i++)
    a[k++]=s[i];
    for(int i=0;i<strlen(s);i++)
    a[k++]=s[i];
    for(int i=0;i<strlen(s);i++){
        k=0;
        for(int j=0;j<strlen(s);j++){
            if(j<size-1)
            printf(" ");
            if(j>=size-1)
            printf("%c",a[k++]);
        }
        size--;
        printf("\n");
    }
    return 0;

}