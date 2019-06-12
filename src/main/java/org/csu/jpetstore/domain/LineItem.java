package org.csu.jpetstore.domain;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author: sun
 * @date: 2019/6/12
 */
@Data
public class LineItem implements Serializable {

    private static final long serialVersionUID = 6804536240033522156L;

    private int orderId;
    private int lineNumber;
    private int quantity;
    private String itemId;
    private BigDecimal unitPrice;
    private Item item;
    private BigDecimal total;

    public LineItem() {
    }

    public LineItem(int lineNumber, CartItem cartItem) {
        this.lineNumber = lineNumber;
        this.quantity = cartItem.getQuantity();
        this.itemId = cartItem.getItem().getItemId();
        this.unitPrice = cartItem.getItem().getListPrice();
        this.item = cartItem.getItem();
    }

    public void setItem(Item item) {
        this.item = item;
        calculateTotal();
    }


    public void setQuantity(int quantity) {
        this.quantity = quantity;
        calculateTotal();
    }

    private void calculateTotal() {
        if (item != null && item.getListPrice() != null) {
            total = item.getListPrice().multiply(new BigDecimal(quantity));
        } else {
            total = null;
        }
    }

}
