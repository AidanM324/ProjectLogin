package ie.atu.projectlogin;


import org.springframework.stereotype.Service;

@Service
public class LoginService {

    private final AccountRepository accountRepo;

    public LoginService(AccountRepository accountRepo) {
        this.accountRepo = accountRepo;
    }

    public void createAccount(Account account){
        accountRepo.save(account);

    }
}
