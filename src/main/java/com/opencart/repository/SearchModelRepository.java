package com.opencart.repository;

import com.opencart.datamodel.FailSearchModel;
import com.opencart.datamodel.SearchModel;
import org.apache.commons.lang3.RandomStringUtils;

public class SearchModelRepository {
    private SearchModelRepository() {
    }

    public static SearchModel getSearchModel() {
        return SearchModel.builder()
                .search("canon")
                .build();
    }

    public static FailSearchModel getFailSearchModel() {
        return FailSearchModel.builder()
                .search(RandomStringUtils.randomAlphabetic(5))
                .build();
    }
}
