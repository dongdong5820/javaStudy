package exception;

/**
 * @author ranlay.su
 * @date 2021-04-13 9:58
 * @desc
 */
public class InsufficientFundsException extends Exception
{
    /**
     * amount用来储存当出现异常（取出钱多于余额时）所缺乏的钱
     */
    private double amount;
    public InsufficientFundsException(double amount)
    {
        this.amount = amount;
    }

    public double getAmount()
    {
        return this.amount;
    }
}
