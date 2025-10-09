package com.vaadin.starter.bakery.backend.data;

import java.util.Locale;
import com.vaadin.flow.shared.util.SharedUtil;

/**
 * Enumeration representing the various possible states of a customer order in
 * the Bakery application.
 * <p>
 * Each constant corresponds to a specific point in the order lifecycle, from
 * creation to delivery or cancellation. The {@link #getDisplayName()} method
 * returns a user-friendly string suitable for UI display.
 * </p>
 *
 * <h2>Possible states:</h2>
 * <ul>
 *   <li>{@link #NEW} — Order has been created but not yet confirmed</li>
 *   <li>{@link #CONFIRMED} — Order has been confirmed by staff</li>
 *   <li>{@link #READY} — Order is prepared and ready for pickup or delivery</li>
 *   <li>{@link #DELIVERED} — Order has been successfully delivered</li>
 *   <li>{@link #PROBLEM} — Order encountered an issue that needs resolution</li>
 *   <li>{@link #CANCELLED} — Order was cancelled by the customer or staff</li>
 * </ul>
 *
 * @author Álvaro
 * @version 1.0
 * @since 2025
 */
public enum OrderState {
    NEW, CONFIRMED, READY, DELIVERED, PROBLEM, CANCELLED;

    /**
     * Returns a human-readable version of the enum constant name, with the
     * first letter capitalized and the rest in lowercase.
     *
     * @return a display-friendly name for the current order state
     */
    public String getDisplayName() {
        return SharedUtil.capitalize(name().toLowerCase(Locale.ENGLISH));
    }
}
