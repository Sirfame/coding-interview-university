public void quickSort(int left, int right) {
    if(right - left <= 0) {
        return;
    } else {
        int pivot = theArray[right];
        int pivotLocation = partitionArray(left, right, pivot);
        quickSort(left, pivotLocation - 1);
        quickSort(pivotLocation + 1, right);
    }
}

public int partitionArray(int left, int right, int pivot) {
    int leftPointer = left - 1;
    int rightPointer = right;

    while(true) {
        while(theArray[leftPointer++] < pivot) {

        }
        while(rightPointer > 0 && theArray[--rightPointer] > pivot) {

        }
        if(leftPointer >= rightPointer) {
            break;
        } else {
            swapValues(leftPointer, rightPointer);
        }
    }
}
