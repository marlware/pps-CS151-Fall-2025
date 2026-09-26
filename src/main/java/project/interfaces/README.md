# interfaces

Contracts describing how a product can be acquired.

## Files
- `BuyableTemp.java` - `isBuyable`, `getEffectiveUnitPrice`, `quoteBuy`, `buy`. Buying takes a quote time and expected total so the customer pays the price they were shown.
- `RentableTemp.java` - `isRentable`, `quoteRental`, `rent`, `rentalReturn`. One item is rented at a time.

## Notes
- Get a quote first, then buy or rent with the same `Instant` so promo pricing stays consistent.
- `Labubu` and `DigiCamTemp` implement `RentableTemp`.
