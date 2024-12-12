class Selective_Repeat {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int windowSize = 3;
        boolean[] ackReceived = new boolean[arr.length];
        int base = 0;

        while (base < arr.length) {
            System.out.println("Current window starts at packet index: " + base);
            for (int i = base; i < base + windowSize && i < arr.length; i++) {
                if (!ackReceived[i]) {
                    System.out.println("Sender sends packet: " + arr[i]);
                }
            }
            for (int i = base; i < base + windowSize && i < arr.length; i++) {
                if (!ackReceived[i]) {
                    if (Math.random() > 0.8) {
                        System.out.println("Receiver did not acknowledge packet: " + arr[i]);
                    } else {
                        System.out.println("Receiver acknowledged packet: " + arr[i]);
                        ackReceived[i] = true;
                    }
                }
            }
            while (base < arr.length && ackReceived[base]) {
                base++;
            }
        }
        System.out.println("All packets sent and acknowledged successfully.");
}
}
