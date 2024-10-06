import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class BankAccountTest {
    private BankAccount bankAccount;

//    Arrange (The object would reset everytime for each test cases)
    @BeforeEach
    void setUpBankAccount(){
        bankAccount = new BankAccount("2219", 300);
    }

    @Test
    void oneHundredDepositShouldEqualFourHundredBalance(){
//        Act
        bankAccount.deposit(100);

//        Assert
        assertEquals(400, bankAccount.getBalance());
    }

    @Test
    void oneHundredWithdrawalShouldEqualTwoHundredBalance(){

//        Act
        bankAccount.withdraw(100);

//        Assert
        assertEquals(200, bankAccount.getBalance());
    }

    @Test
    void gettingAccountNumberShouldReturnAccountNumber(){
        assertEquals("2219", bankAccount.getAccountNumber());
    }

    @Test
    void negativeAmountDepositShouldThrowIllegalArgumentException(){
        assertThrows(IllegalArgumentException.class, () -> {
            bankAccount.deposit(-1);
        });
    }
}