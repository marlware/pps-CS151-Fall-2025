# exceptions

Custom checked exceptions used across the shop. Each has the four standard constructors (no args, message, message + cause, cause).

## Files
- `InvalidUserChoice.java` - the user entered a menu choice that isn't valid.
- `OverHundredObjects.java` - a class hit its limit of 100 created objects.
- `ProductNotFound.java` - no product matches the given ID.
- `VendorNotFound.java` - no vendor matches the given ID.

## Usage
Catch these where the user input is handled (mainly `ShopTemp`) and print a friendly message instead of crashing.
