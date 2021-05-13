package repository;

import datamodel.QuantityModel;
import org.apache.commons.lang3.RandomStringUtils;

public class ChangeQuantityRepository {

    private ChangeQuantityRepository() {
    }

    public static QuantityModel getQuantityModel() {
            return QuantityModel.getBuilder()
                    .ChangeQuantity(RandomStringUtils.randomNumeric(1, 2))
                    .build();
    }
}
