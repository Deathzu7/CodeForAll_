public class Hotel {

    public Room[] rooms;


    public Hotel(Room[] rooms) {
        this.rooms = rooms;
    }

    public Room checkIn() {
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].isAvailable()) {
                System.out.println("Rooms available: " + rooms[i].getRoomNumber() + " - " + rooms[i].isAvailable());
                rooms[i].roomIsFull();
                return rooms[i];
            } else {
                System.out.println("No rooms available in this hotel");

            }
        }

    }

    public Room checkOut(){
    for (int i = 0; i < rooms.length; i++) {
        if (rooms[i] = roomsToCheckOut)
    }
    }

}
