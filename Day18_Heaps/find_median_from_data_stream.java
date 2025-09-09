class MedianFinder {
    Queue<Integer> minHeap, maxHeap;
    public MedianFinder() {

        // Use two heaps like left half and right half;
        minHeap = new PriorityQueue<>();
        maxHeap = new PriorityQueue<>((a,b)->Integer.compare(b,a));
    }
    
    public void addNum(int num) {
        if(maxHeap.isEmpty() || maxHeap.peek()>=num){
            maxHeap.add(num);
        }
        else{
            minHeap.add(num);
        }

        // The heaps difference should differ by atmost one;
        if(Math.abs(minHeap.size()-maxHeap.size())>1){
            if(minHeap.size()>maxHeap.size()){
                while(!minHeap.isEmpty() && Math.abs(minHeap.size()-maxHeap.size())>1){
                    maxHeap.add(minHeap.remove());
                }
            }
            else{
                while(!maxHeap.isEmpty() && Math.abs(minHeap.size()-maxHeap.size())>1){
                    minHeap.add(maxHeap.remove());
                }
            }
        }
    }
    
    public double findMedian() {

        // If one heap's size is greater than other, then that heap's top element is the median;
        if(minHeap.size()>maxHeap.size()){
            return (double)minHeap.peek();
        }
        else if(minHeap.size()<maxHeap.size()){
            return (double)maxHeap.peek();
        }

        // If the size of both heaps is same, then the median is the mean of both heap's top elements;
        else{
            return (double)(minHeap.peek()+maxHeap.peek())/2;
        }
    }
}
