
/**
 * Write a description of class Buy_Paid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Buy_Paid extends Invoice
{
    // instance variables - replace the example below with your own
    private InvoiceType INVOICE_TYPE = InvoiceType.Buy;
    private InvoiceStatus INVOICE_STATUS = InvoiceStatus.Paid;
    

    /**
     * Constructor for objects of class Buy_Paid
     */
    public Buy_Paid(int id, Item item, int totalItem)
    {
        // initialise instance variables
        super(id,item,totalItem);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public InvoiceStatus getInvoiceStatus()
    {
        // put your code here
        return INVOICE_STATUS;
    }
    public InvoiceType getInvoiceType()
    {
        // put your code here
        return INVOICE_TYPE;
    }
    public void printData()
    {
        System.out.println("==========INVOICE==========");
        System.out.println("ID:" + super.getId());
        System.out.println("Date:" + super.getDate());
        System.out.println("Item :" + super.getItem().getName());
        System.out.println("Total Item:" + super.getTotalItem());
        System.out.println("Total Price:" + super.getTotalPrice());
        System.out.println("Status:" + INVOICE_STATUS);
        System.out.println("Type :" + INVOICE_TYPE);
    }
    
    public String toString()
    {
        // put your code here
        return "ID = ";
    }
}