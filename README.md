# FlightTicketPrice
A program that calculates the ticket prices that users have to pay by taking as input the distance they want to fly, their age, and whether they prefer a one-way or round-trip ticket.
The program first calculates the initial price by multiplying the distance passengers want to fly by $0.1 per kilometer.
> distance(km) * $0.1(per km) = Initial Price

`initPrice= dist*0.1;`

## Discounts
In the scope this program, passengers who want to buy tickets are given some discounts on the initial price. Age and ticket type are these discounts.

### Age Discount
- 50% discount is applies to under 12 years old.
- 10% discount is applied for 12-24 year olds.
- 30%  discount is applied for 65 years and older.

` if (age<12){
                secPrice=initPrice*0.5;    `


### Ticket Type Discount
Depending on the passengers' one-way or round-trip flight ticket preferences, a discount is applied over the age discounted price.
- 20% discount is applied to those who prefer a round trip ticket.
- Discounts are not applied to those who prefer a one-way ticket.

`     if (type==2){
                        finalPrice=secPrice*0.8;
                    } `
