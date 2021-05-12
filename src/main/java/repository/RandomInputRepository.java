package repository;

import datamodel.RandomInputModel;
import org.apache.commons.lang3.RandomStringUtils;

public class RandomInputRepository {

    private RandomInputRepository() {
    }

    public static RandomInputModel getRandomInputModel() {
        return RandomInputModel.getBuilder()
                .FirstName(RandomStringUtils.randomAlphabetic(6))
                .LastName(RandomStringUtils.randomAlphabetic(6))
                .Email(RandomStringUtils.randomAlphabetic(6) + "@gmail.com")
                .Telephone(RandomStringUtils.randomAlphabetic(6))
                .FirstAddress(RandomStringUtils.randomAlphabetic(6))
                .City(RandomStringUtils.randomAlphabetic(6))
                .Postcode(RandomStringUtils.randomAlphabetic(6))
                .build();
    }
}
