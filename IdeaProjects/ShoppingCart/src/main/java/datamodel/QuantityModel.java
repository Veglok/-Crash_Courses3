package datamodel;

import lombok.Getter;



@Getter
public class QuantityModel {
    private String ChangeQuantity;

    QuantityModel() {
    }

    public static QuantityModel.Builder getBuilder() {
        return new QuantityModel().new Builder();

    }
    public class Builder {
        public QuantityModel.Builder ChangeQuantity(String value) {
            ChangeQuantity = value;
            return this;
        }
        public QuantityModel build() {
            return QuantityModel.this;
        }
    }

}
