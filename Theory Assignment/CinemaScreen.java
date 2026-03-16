public class CinemaScreen {
    String name;
    String id;
    String type;
    Seat seats[][];
  
    public CinemaScreen(String name, String id, int seatCount) {
        this.name = name;
        this.id = id;
        seats = new Seat[5][];
        seats[0] = new Seat[10];
        seats[1] = new Seat[11];
        seats[2] = new Seat[12];
        seats[3] = new Seat[13];
        seats[4] = new Seat[14];
        for(int i=0;i<seats.length;i++){
            for(int j=0;j<seats[i].length;j++)
                seats[i][j]= new Seat(SeatType.Regular," "+i);
        }
    } 
    public void displaySeats() {
        for(int i=0; i<seats.length;i++){
            System.out.println();
            for (int j=0; j<seats[i].length; j++)
                System.out.print(seats[i][j] + " ");
        }
    } 


    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        for(int i=0; i< seats.length; i++){
            stringBuilder.append("\n");
            for (int j = 0; j < seats[i].length; j++)
                stringBuilder.append(seats[i][j] + "  ");

        }
        return stringBuilder.toString();
    }  
}        