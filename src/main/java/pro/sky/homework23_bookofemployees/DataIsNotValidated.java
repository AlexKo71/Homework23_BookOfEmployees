package pro.sky.homework23_bookofemployees;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus (HttpStatus.BAD_REQUEST)
public class DataIsNotValidated  extends RuntimeException{
}

