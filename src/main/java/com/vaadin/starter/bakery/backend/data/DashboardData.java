package com.vaadin.starter.bakery.backend.data;

import java.util.LinkedHashMap;
import java.util.List;

import com.vaadin.starter.bakery.backend.data.entity.Product;

/**
 * A data transfer object (DTO) that holds dashboard statistics and aggregates
 * for the Bakery application. This class encapsulates delivery statistics,
 * deliveries count over different time periods, product delivery counts,
 * and monthly sales data.
 */
public class DashboardData {

    /**
     * Delivery statistics including totals and status counts.
     */
    private DeliveryStats deliveryStats;

    /**
     * List of delivery counts for each day in the current month.
     */
    private List<Number> deliveriesThisMonth;

    /**
     * List of delivery counts for each month in the current year.
     */
    private List<Number> deliveriesThisYear;

    /**
     * Two-dimensional array containing sales per month.
     * Each row represents a month, and each column a sales data point.
     */
    private Number[][] salesPerMonth;

    /**
     * Map of products to the number of times each was delivered.
     */
    private LinkedHashMap<Product, Integer> productDeliveries;

    /**
     * Gets the overall delivery statistics.
     *
     * @return the delivery statistics
     */
    public DeliveryStats getDeliveryStats() {
        return deliveryStats;
    }

    /**
     * Sets the overall delivery statistics.
     *
     * @param deliveryStats the delivery statistics to set
     */
    public void setDeliveryStats(DeliveryStats deliveryStats) {
        this.deliveryStats = deliveryStats;
    }

    /**
     * Gets the list of delivery counts for each day in the current month.
     *
     * @return the deliveries for this month
     */
    public List<Number> getDeliveriesThisMonth() {
        return deliveriesThisMonth;
    }

    /**
     * Sets the list of delivery counts for each day in the current month.
     *
     * @param deliveriesThisMonth the deliveries for this month to set
     */
    public void setDeliveriesThisMonth(List<Number> deliveriesThisMonth) {
        this.deliveriesThisMonth = deliveriesThisMonth;
    }

    /**
     * Gets the list of deliveries for each month in the current year.
     *
     * @return the deliveries for this year
     */
    public List<Number> getDeliveriesThisYear() {
        return deliveriesThisYear;
    }

    /**
     * Sets the list of deliveries for each month in the current year.
     *
     * @param deliveriesThisYear the deliveries for this year to set
     */
    public void setDeliveriesThisYear(List<Number> deliveriesThisYear) {
        this.deliveriesThisYear = deliveriesThisYear;
    }

    /**
     * Sets the sales data per month.
     *
     * @param salesPerMonth the sales per month to set
     */
    public void setSalesPerMonth(Number[][] salesPerMonth) {
        this.salesPerMonth = salesPerMonth;
    }

    /**
     * Gets the sales data for a specific month.
     *
     * @param i the month index
     * @return the sales data for the month
     */
    public Number[] getSalesPerMonth(int i) {
        return salesPerMonth[i];
    }

    /**
     * Gets a map of products and their delivery counts.
     *
     * @return the product deliveries
     */
    public LinkedHashMap<Product, Integer> getProductDeliveries() {
        return productDeliveries;
    }

    /**
     * Sets the map of products and their delivery counts.
     *
     * @param productDeliveries the product deliveries to set
     */
    public void setProductDeliveries(LinkedHashMap<Product, Integer> productDeliveries) {
        this.productDeliveries = productDeliveries;
    }

}
