arr=[8,2,10,7,15,3];
n=len(arr);
i=0;
while(i<n):
    min_index=i;
    j=i+1;
    while(j<n):
        if(arr[j]<arr[min_index]):
            min_index=j;
        j=j+1;
        
        k=arr[i];
        arr[i]=arr[min_index];
        arr[min_index]=k;
    i=i+1;

print(arr);

