import java.math.BigDecimal;
import java.time.LocalDate;

public class TicketService {
    public static void main(String[] args) {
        Ticket emptyTicket = new Ticket();
        Ticket limitedTicket = new Ticket("TheBestHall", 125, LocalDate.of(2024, 11, 22));
        Ticket fullTicket = new Ticket("100", "GoodHall", 347, LocalDate.of(2025, 3, 17), true, StadiumSector.A, 34.2);

        fullTicket.setPrice(new BigDecimal("124.45"));

        System.out.println("Empty ticket: " + emptyTicket);
        System.out.println("Limited ticket: " + limitedTicket);
        System.out.println("Full ticket: " + fullTicket);
    }
}
