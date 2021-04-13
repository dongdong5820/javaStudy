package exception;

/**
 * @author ranlay.su
 * @date 2021-04-13 9:59
 * @desc
 */
public class CheckingAccount
{
    /**
     * balance为余额，number为卡号
     */
    private double balance;
    private int number;

    public CheckingAccount(int number)
    {
        this.number = number;
    }

    // 存钱
    public void deposit(double amount)
    {
        balance += amount;
    }

    // 取钱
    public void withdraw(double amount) throws InsufficientFundsException
    {
        if (amount <= balance) {
            balance -= amount;
        } else {
            double needs = amount - balance;
            throw new InsufficientFundsException(needs);
        }
    }

    public double getBalance()
    {
        return balance;
    }

    public int getNumber() {
        return number;
    }
}
