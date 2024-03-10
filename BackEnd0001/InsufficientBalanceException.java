package BackEnd0001;

public class InsufficientBalanceException extends Exception{
    private String message;
    public InsufficientBalanceException(String accountId,int pendingAmount){
        super("余额不足! 账户号码为:"+accountId+"尝试提取的金额为:"+pendingAmount);
        this.message="账户号码为:"+accountId+"尝试提取的金额为:"+pendingAmount;
    }
}
