package com.anti.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceBNotfoundError extends RuntimeException {
    private String resourceName;
    private String filedeName;
    private String filevalue;
    
	public ResourceBNotfoundError(String resourceName, String filedeName, String filevalue) {
		super("Error "+ resourceName);
		this.resourceName = resourceName;
		this.filedeName = filedeName;
		this.filevalue = filevalue;
	}

	public String getResourceName() {
		return resourceName;
	}

	public String getFiledeName() {
		return filedeName;
	}

	public String getFilevalue() {
		return filevalue;
	}
    
}
