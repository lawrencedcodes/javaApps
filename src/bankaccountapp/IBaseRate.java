package bankaccountapp;

public interface IBaseRate  {
    //Write method that returns base rate
    default double getBaseRate() {
        return 2.5;
    }
}
