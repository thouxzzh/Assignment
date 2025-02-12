package OOPS;
class InvoiceItem1 {
			    private String id;
			    private String desc;
			    private int qty;
			    private double unitPrice;

			    public InvoiceItem1(String id, String desc, int qty, double unitPrice) {
			        this.id = id;
			        this.desc = desc;
			        this.qty = qty;
			        this.unitPrice = unitPrice;
			    }

			    public String getId() {
			        return id;
			    }

			    public String getDesc() {
			        return desc;
			    }

			    public int getQty() {
			        return qty;
			    }

			    public void setQty(int qty) {
			        this.qty = qty;
			    }

			    public double getUnitPrice() {
			        return unitPrice;
			    }

			    public void setUnitPrice(double unitPrice) {
			        this.unitPrice = unitPrice;
			    }

			    public double getTotal() {
			        return unitPrice * qty;
			    }

			    public String toString() {
			        return "InvoiceItem[id=" + id + ",desc=" + desc + ",unitPrice=" + unitPrice + "]";
			    }
			}
			public class InvoiceItem {
			    public static void main(String[] args) {
			        InvoiceItem1 item = new InvoiceItem1("123", "Laptop", 2, 50000.0);
			        
			        System.out.println(item.getTotal());    
			        item.setQty(3);
			        item.setUnitPrice(45000.0);
			        System.out.println(item.getQty());      
			        System.out.println(item.getUnitPrice());
			        System.out.println(item.getTotal());    
			        System.out.println(item.toString());     
			    }
			}

		
		




