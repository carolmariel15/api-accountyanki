package com.nttdata.document;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Unwrapped.Nullable;
import java.time.LocalDateTime;

@Getter
@Setter
@Document(collection = "account_yanki")
public class AccountYanki {
	
	@Id
	private String accountId;
	private String clientId;
	private String phone;
	private Integer typeAccountId;
	private Integer currencyId;
	@Nullable
	private LocalDateTime membershipDate;
	@Nullable
	private Boolean main;
	private double balance;
	@Nullable
	private String cardNumber;

}
