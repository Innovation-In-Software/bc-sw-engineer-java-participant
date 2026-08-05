public class AbstractSavings extends AbstractAccount {
    public AbstractSavings(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public String getAccountType() {
        return "Savings";
    }
}
