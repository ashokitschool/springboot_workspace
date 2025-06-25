package in.ashokit.exception;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class ExInfo {

	private String exCode;

	private String exMsg;

	private LocalDateTime exDate;

}
