
def binaryRecursive(arr, initVal,size,selVal):
        if(size>=initVal):
            mid=int((size+initVal)/2);
            if(arr[mid] == selVal):
             return mid;
            if(arr[mid]>selVal):
             return  binaryRecursive(arr,initVal,mid-1,selVal);
            return  binaryRecursive(arr,mid+1,size,selVal);
        return -1;
            

arr=[2, 3, 4, 10, 40,45,78,6756];
size=len(arr);
result=binaryRecursive(arr,0,size,6756);
print(result)
