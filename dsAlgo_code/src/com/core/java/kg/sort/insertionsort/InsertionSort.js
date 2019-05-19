function insertionSort(arr){
    if(typeof arr!="undefined" && Array.isArray(arr) && arr.length>0){
        var n=arr.length;
        for(var i=1;i<n;++i){
            var key=arr[i];
            j=i-1;

            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j-=1;
            }
            arr[j+1]=key;
        }
    }

}

var arr=[12,11,13,5,6];
insertionSort(arr);
console.log(arr);