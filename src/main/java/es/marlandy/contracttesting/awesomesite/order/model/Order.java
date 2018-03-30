package es.marlandy.contracttesting.awesomesite.order.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 *
 * @author marlandy
 */
@XmlRootElement
@XmlType(propOrder = {"id", "price", "voucher", "status"})
@JsonInclude(Include.NON_NULL)
public class Order {

    public static final Integer CREATED = 1;

    public static final Integer FINISHED = 2;

    public static final Integer CANCELED = 3;

    private String id;

    private Double price;
	
    private String voucher;

    private Integer status;
	
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getVoucher() {
        return voucher;
    }

    public void setVoucher(String voucher) {
        this.voucher = voucher;
    }

    public Integer getStatus() {
        return status;
    }

	public void setStatus(Integer status) {
        this.status = status;
    }
	
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Order)) {
            return false;
        }

        final Order other = (Order) o;
        return new EqualsBuilder().append(this.id, other.getId()).isEquals();

    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(this.id).hashCode();
    }

    @Override
    public String toString() {
        return "Order{" + "id=" + id + ", price=" + price + ", voucher=" + voucher + ", status=" + status + '}';
    }

}
