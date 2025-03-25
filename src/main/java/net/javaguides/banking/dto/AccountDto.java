package net.javaguides.banking.dto;



/*import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
//transforme data between client and service
public class AccountDto {

    private Long id;
    private String accountHolderName;
    private double balance;


}*/


import java.math.BigDecimal;

public record AccountDto(Long id, String accountHolderName, double balance) {
}


