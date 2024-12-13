class Main {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5}; 
        int currentPacket = 0; 

        while (currentPacket < arr.length) {
            System.out.println("Sender sends packet: " + arr[currentPacket]);
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                System.err.println("Thread was interrupted: " + e.getMessage());
            }
            if (Math.random() > 0.8) {  loss
                System.out.println("Receiver did not acknowledge packet: " + arr[currentPacket]);
                System.out.println("Retransmitting packet: " + arr[currentPacket]);
            } else {
                System.out.println("Receiver acknowledged packet: " + arr[currentPacket]);
                currentPacket++; 
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.err.println("Thread was interrupted: " + e.getMessage());
            }
        }

        System.out.println("All packets sent and acknowledged successfully.");
    }
}
