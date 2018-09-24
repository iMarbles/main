package seedu.address.model.record;

import static java.util.Objects.requireNonNull;
import static seedu.address.commons.util.AppUtil.checkArgument;

/**
 * Represents an Hour in a record
 * Guarantees: immutable; hour is valid as declared in {@link #isValidHour(String)}
 */
public class Hour {
    public static final String MESSAGE_TAG_CONSTRAINTS = "Hour can take in numerals only.";
    public static final String REMARK_VALIDATION_REGEX = "\\p{Digit}+";

    public final String value;

    /**
     * Constructs a {@code Remark}.
     *
     * @param hour A valid hour.
     */
    public Hour(String hour) {
        requireNonNull(hour);
        checkArgument(isValidHour(hour), MESSAGE_TAG_CONSTRAINTS);
        this.value = hour;
    }

    /**
     * Returns true if a given string is a valid remark.
     */
    public static boolean isValidHour(String test) {
        return test.matches(REMARK_VALIDATION_REGEX);
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Hour // instanceof handles nulls
                && value.equals(((Hour) other).value)); // state check
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    /**
     * Format state as text for viewing.
     */
    public String toString() {
        return value;
    }
}
