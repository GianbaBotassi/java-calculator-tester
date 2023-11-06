package Model;

import exceptions.LowerThanZeroException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class TicketTest {

    @Test
    @DisplayName("Calcolo biglietto")
    void getTotal() {
        for (int i = -2000; i < 2000; i++) {
            for (int j = -120; j < 120; j++) {
                int i2 = i;
                int j2 = j;
                if (i <= 0 || j <= 0) {
                    assertThrows(LowerThanZeroException.class, () -> {
                        Ticket ticket = new Ticket(i2, j2);
                    });
                } else {
                    Ticket ticket = new Ticket(i2, j2);
                    double price = i * Ticket.priceKm;
                    if (j < 18) {
                        double discountPrice = price * Ticket.under18Discount;
                        assertEquals(discountPrice, ticket.getTotal());
                    } else if (j > 65) {
                        double discountPrice = price * Ticket.over65Discount;
                        assertEquals(discountPrice, ticket.getTotal());
                    } else {
                        assertEquals(price, ticket.getTotal());
                    }
                }
            }
        }
    }
}