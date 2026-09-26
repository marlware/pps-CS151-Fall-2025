# abstractclasses

Base classes for the shop's products.

## Files
- `Product.java` - abstract parent of every product. Holds the vendor-scoped product ID, type, price, stock and owning vendor.

## Notes
- Prices are validated on creation and update; a negative price or stock throws `IllegalArgumentException`.
- `calculateActualPrice(discount)` and `getEffectiveUnitPrice(now)` apply the owner's active promo (see `PromoWindow` in `models`).
- To add a product type, extend `Product` and implement `BuyableTemp` and/or `RentableTemp`.
