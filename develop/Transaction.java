package Team13Project.develop;

/**
 * This class represents a financial transaction.
 * @author Ben Macgillivray - 3735161.
 */

public class Transaction {

    /**
     * The ID number of a transaction.
     */
    private int transactionID;

    /**
     * The ID number for the member making a transaction.
     */
    private int memberID;

    /**
     * The date of a transaction.
     */
    private String transactionDate;

    /**
     * The amount of a transaction.
     */
    private double transactionAmount;

    /**
     * The payment method used for a transaction.
     */
    private String paymentMethod;

    /**
     * The starting point for transaction ID's.
     */
    private static int assignedTransactionID = 1;

    /**
     * This method constructs a transaction containing the ID number, 
     * member ID, date, amount, and payment method of a transaction.
     * @param dateIn The date of a transaction.
     * @param amountIn The amount of a transaction.
     * @param payMethodIn The payment method of a transaction.
     */
    public Transaction(int memberIn, String dateIn, double amountIn, String payMethodIn) {
        transactionID = assignedTransactionID;
        memberID = memberIn;
        transactionDate = dateIn;
        transactionAmount = amountIn;
        paymentMethod = payMethodIn;
        assignedTransactionID++;
    }

    /**
     * This method retrieves the ID number of a transaction.
     * @return The ID number of a transaction.
     */
    public int getTransactoinID() {
        return transactionID;
    }

    /**
     * This method retrieves the date of a transaction.
     * @return The date of a transaction.
     */
    public String getTransactionDate() {
        return transactionDate;
    }

    /**
     * This method retrieves the amount of a transaction.
     * @return The amount of a transaction.
     */
    public double getTransactionAmount() {
        return transactionAmount;
    }

    /**
     * This method retrieves the payment method of a transaction.
     * @return The payment method of a transaction.
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * This method retrieves information regarding a transaction.
     * @return Information about a transaction.
     */
    public String toString() {
        return "Transaction Info for Transaction #" + transactionID + 
                ":\n  Date of Transaction: " + transactionDate + "\n  Amount of Transaction: " + 
                transactionAmount + "\n  Payment Method: " + paymentMethod;
    }

}