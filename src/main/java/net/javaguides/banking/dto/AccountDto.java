package net.javaguides.banking.dto;



import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;


@Data
@AllArgsConstructor
//transforme data between client and service
public class AccountDto {

    private Long id;
    private String accountHolderName;
    private double balance;


}
