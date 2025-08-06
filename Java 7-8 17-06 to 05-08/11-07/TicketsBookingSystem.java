class BookingApp {
    char[][] seats;

    BookingApp(int rows, int cols) { // rows=3, cols=5
        seats = new char[rows][cols];
    }

    void initializeSeats() {
        for(int i=0; i<=seats.length-1; i++) {
            for(int j=0; j<=seats[i].length-1; j++) {
                seats[i][j] = 'A';
            }
        }
        System.out.println("All seats initialized");
    }

    void bookSeat(int row, int col) {
        if(row <= seats.length-1 && col <= seats[0].length-1) {
            if(seats[row][col] != 'B') {
                seats[row][col] = 'B';
                System.out.println("Seat booked");
            }
            else {
                System.out.println("Sorry, choose another seat");
            }
        }
    }

    void showSeatingArrangement() {
        for(int i=0; i<=seats.length-1; i++) {
            for(int j=0; j<=seats[i].length-1; j++) {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }
    }
}

class TicketsBookingSystem {
    public static void main(String[] args) {
        BookingApp bApp = new BookingApp(3, 5);

        bApp.initializeSeats();
        bApp.showSeatingArrangement();

        // book seat
        bApp.bookSeat(0, 3);
        bApp.bookSeat(1, 2);
        bApp.bookSeat(2, 4);
        // again booking a occupied seat
        bApp.bookSeat(1, 2);

        bApp.showSeatingArrangement();
    }
}