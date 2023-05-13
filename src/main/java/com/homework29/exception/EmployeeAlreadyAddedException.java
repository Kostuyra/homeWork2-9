package com.homework29.exception;

import com.homework29.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class EmployeeAlreadyAddedException extends RuntimeException {
	public EmployeeAlreadyAddedException(Employee employee){
		super("Сотрудник " + employee.toString() + " уже существует");
	}
}
