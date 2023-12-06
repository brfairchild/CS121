package weekFour;

import javax.swing.*;

public class HotelOccupancy {
    public static void main(String[] args) {
        // grabbing how many floors the hotel has
        int floorNm = Integer.parseInt(JOptionPane.showInputDialog(null,"How many floors does the hotel have?"));
        double roomCount = 0;
        double totOcuCount = 0;

        for (int i = 1; i <= floorNm; i++){
            // I could not have the totalling out options and just have the ints themselves keep count, but I find it easier for me to keep track of them doing it this way.
            // Room count per floor
            int floorRmNm = Integer.parseInt(JOptionPane.showInputDialog(null,"How many rooms does floor " + i + " have?"));
            // totalling out
            roomCount = roomCount + floorRmNm;

            // Occupied room count
            int ocuCount = Integer.parseInt(JOptionPane.showInputDialog(null,"How many rooms on floor " + i +" are occupied?"));
            // totalling out
            totOcuCount = totOcuCount + ocuCount;
        }

        // Math for ocuRate and vacRooms
        double ocuRate = roomCount / totOcuCount;
        double vacRooms = roomCount - totOcuCount;

        // Displaying all the collected data
        JOptionPane.showMessageDialog(null,"Total Number of Floors: "+floorNm+"\n"+"Total Rooms: "+roomCount+"\n"+"Occupied Rooms: "+totOcuCount+"\n"+"Vacant Rooms: "+vacRooms+"\n"+"Occupancy: "+ocuRate);
    }
}
