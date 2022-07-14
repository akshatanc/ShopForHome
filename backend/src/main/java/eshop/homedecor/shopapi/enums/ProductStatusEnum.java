package eshop.homedecor.shopapi.enums;

import lombok.Getter;


@Getter
public enum ProductStatusEnum implements CodeEnum{
    UP(0, "Available"),
    DOWN(1, "Unavailable")
    ;
    private Integer code;
    private String message;
    
    

    public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getStatus(Integer code) {

        for(ProductStatusEnum statusEnum : ProductStatusEnum.values()) {
            if(statusEnum.getCode() == code) return statusEnum.getMessage();
        }
        return "";
    }

    public Integer getCode() {
        return code;
    }
}
