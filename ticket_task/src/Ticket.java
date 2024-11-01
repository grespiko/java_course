import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ticket {
    private String id;
    private String concertHole;
    private int eventCode;
    private LocalDate time;
    private boolean isPromo;
    private StadiumSector stadiumSector;
    private double maxAllowedBackpack;
    private String creationTime;

    private BigDecimal price;

    public Ticket() {
        this.setCreationTime();
    }

    public Ticket(String concertHole, int eventCode, LocalDate time) {
        this.setConcertHole(concertHole);
        this.setEventCode(eventCode);
        this.time = time;
        this.setCreationTime();
    }

    public Ticket(String id, String concertHole, int eventCode, LocalDate time, boolean isPromo, StadiumSector stadiumSector, double maxAllowedBackpack) {
        this.setId(id);
        this.setConcertHole(concertHole);
        this.setEventCode(eventCode);
        this.time = time;
        this.isPromo = isPromo;
        this.stadiumSector = stadiumSector;
        this.maxAllowedBackpack = maxAllowedBackpack;
        this.setCreationTime();
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id='" + id + '\'' +
                ", concertHole='" + concertHole + '\'' +
                ", eventCode=" + eventCode +
                ", time=" + time +
                ", isPromo=" + isPromo +
                ", stadiumSector=" + stadiumSector +
                ", maxAllowedBackpack=" + maxAllowedBackpack +
                ", creationTime='" + creationTime + '\'' +
                ", price=" + price +
                '}';
    }

    private void setId(String inputId) {
        if (!inputId.isEmpty() && inputId.length() < 5) {
            if (inputId.replaceAll("[a-zA-Z0-9]", "").isEmpty()) {
                this.id = inputId;
            }
        } else {
            System.out.println("ID should contain 1-4 chars.");
        }
    }

    private void setConcertHole(String inputConcertHole) {
        if (!inputConcertHole.isEmpty() && inputConcertHole.length() < 11) {
            if (inputConcertHole.replaceAll("[\\S]", "").isEmpty()) {
                this.concertHole = inputConcertHole;
            }
        } else {
            System.out.println("ConcertHole should contain 1-10 chars.");
        }
    }

    private void setEventCode(int inputEventCode) {
        if (inputEventCode > 0 && inputEventCode < 999) {
            this.eventCode = inputEventCode;
        } else {
            System.out.println("EventCode must be between 0 and 999.");
        }
    }

    private void setCreationTime() {
        LocalDateTime time = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss a");
        this.creationTime = time.format(formatter);
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
