package com.ecommerce.api.apiecommerce.Services;

import com.ecommerce.api.apiecommerce.Models.BairroModels;
import com.ecommerce.api.apiecommerce.Models.CityModels;
import com.ecommerce.api.apiecommerce.Repositories.BairroRepositories;
import com.ecommerce.api.apiecommerce.Repositories.CityRepositories;

import javax.transaction.Transactional;
import java.util.Optional;

public class BairroServices {
    final BairroRepositories bairroRepositories;

    public BairroServices(BairroRepositories bairroRepositories) {
        this.bairroRepositories = bairroRepositories;
    }

    @Transactional
    public BairroModels save(BairroModels bairroModels){
        return bairroRepositories.save(bairroModels);
    }

    public Optional<BairroModels> findById(long id) {
        return bairroRepositories.findById(id);
    }
}
