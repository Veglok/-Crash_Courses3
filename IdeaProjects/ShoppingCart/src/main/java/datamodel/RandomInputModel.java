package datamodel;

import lombok.Getter;

@Getter
public class RandomInputModel {
    private String firstName;
    private String lastName;
    private String email;
    private String telephone;
    private String firstAddress;
    private String city;
    private String postcode;

    RandomInputModel() {
    }

    public static RandomInputModel.Builder getBuilder() {
        return new RandomInputModel().new Builder();
    }

    public class Builder {
        public RandomInputModel.Builder FirstName(String value) {
            firstName = value;
            return this;
        }

        public RandomInputModel.Builder LastName(String value) {
            lastName = value;
            return this;
        }

        public RandomInputModel.Builder Email(String value) {
            email = value;
            return this;
        }

        public RandomInputModel.Builder Telephone(String value) {
            telephone = value;
            return this;
        }

        public RandomInputModel.Builder FirstAddress(String value) {
            firstAddress = value;
            return this;
        }

        public RandomInputModel.Builder City(String value) {
            city = value;
            return this;
        }

        public RandomInputModel.Builder Postcode(String value) {
            postcode = value;
            return this;
        }

        public RandomInputModel build() {
            return RandomInputModel.this;
        }
    }
}
