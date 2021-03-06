package com.xmbl.h5.web.game.config.mongo;

import com.xmbl.h5.web.common.db.mongo.AbstractMongoConfig;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

@Configuration
@Component
@ConfigurationProperties(prefix = "spring.data.mongo.tgmatch")
public class TGMatchMongoConfig extends AbstractMongoConfig {

    @Override
    @Bean("stageMongoTemplate")
    public MongoTemplate getMongoTemplate() throws Exception {
        return new MongoTemplate(mongoDbFactory());
    }
}
