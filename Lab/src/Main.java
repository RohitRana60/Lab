import java.util.Random;

public class StopAndWait {
    public static void main(String[] args) {
        int packets[] = {1, 2, 3, 4, 5}; // Packets to be sent
        int packetIndex = 0;            // Current packet index
        Random random = new Random();

        System.out.println("Starting Stop-and-Wait Protocol Simulation...");

        while (packetIndex < packets.length) {
            System.out.println("Sender: Sending packet " + packets[packetIndex]);
            
            // Simulate random ACK loss
            if (random.nextDouble() > 0.8) {
                System.out.println("Receiver: Packet " + packets[packetIndex] + " lost. No acknowledgment sent.");
                System.out.println("Sender: Timeout occurred. Resending packet " + packets[packetIndex]);
                continue; // Resend the same packet
            } else {
                System.out.println("Receiver: Packet " + packets[packetIndex] + " received successfully.");
                System.out.println("Receiver: Acknowledgment for packet " + packets[packetIndex] + " sent.");
            }

            // Move to the next packet after successful acknowledgment
            packetIndex++;
        }

        System.out.println("All packets sent and acknowledged successfully.");
    }
}
