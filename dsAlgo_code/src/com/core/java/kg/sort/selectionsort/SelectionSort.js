var arr=[8,2,10,7,15,3];
var i=0;
var n=arr.length;

while(i<n){

    var min_index=i;
    var j=i+1;
    while(j<n){
        if(arr[j]<arr[min_index]){
            min_index=j;
        }
          j++;
    }
    var k=arr[i];
    arr[i]=arr[min_index];
    arr[min_index]=k;

    i++;

}

console.log(arr);
