public class Seat {
    String seatID;
    SeatType seatType;
    String Row;
    Boolean isAvailable;

    static int counter;

    Seat(SeatType type, String row){
        seatID=row+String.format("%02d",counter++);
        this.seatType=type;
        this.Row=row;

    }
    
    public String getSeatID() {
        return seatID;
    }

    public SeatType getSeatType() {
        return seatType;
    }

    public String getRow() {
        return Row;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    @Override
    public String toString(){
        return String.format("%s %s %s %.2f %b", seatID,seatType,Row,seatType.price,isAvailable);
    }

}

enum SeatType{
    Regular(10.00),
    Premium(15.00),
    VIP(25.00);

    double price;

    SeatType(double price) {
        this.price = price;
    }
}