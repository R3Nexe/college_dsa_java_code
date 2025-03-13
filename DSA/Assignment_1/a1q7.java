class a1q7 {
    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5, 1, 3, 12};
        int max = arr[0];
        int min = arr[0];
        int minLastOccur = 0;
        int maxFirstOccur = 0;
        int minCount = 0;
        int maxCount = 0;
        int maxLastOccur = 0;

        for (int i = 0; i < arr.length; i++) {
        
            if (arr[i] > max) {
                max = arr[i];
                maxCount = 1;
                maxFirstOccur = i;
                maxLastOccur = i;
            } else if (arr[i] == max) {
                maxCount++;
                maxLastOccur = i;
            }

    
            if (arr[i] < min) {
                min = arr[i];
                minCount = 1;
                minLastOccur = i;
            } else if (arr[i] == min) {
                minCount++;
                minLastOccur = i;
            }
        }

        System.out.println("Maximum element of Array is " + max + " and occurs " + maxCount + " times.");
        System.out.println("Minimum element of Array is " + min + " and occurs " + minCount + " times.");
        System.out.println("First occurrence of maximum element is at position " + maxFirstOccur);
        System.out.println("Last occurrence of maximum element is at position " + maxLastOccur);
        System.out.println("Last occurrence of minimum element is at position " + minLastOccur);
    }
}
