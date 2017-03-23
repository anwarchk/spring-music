package org.cloudfoundry.samples.music.config.data;

import com.mongodb.MongoClient;
import org.springframework.context.annotation.*;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

@Configuration
@Profile("mongodb-local")
public class MongoLocalConfig {

    @Bean
    public MongoDbFactory mongoDbFactory() {
        return new SimpleMongoDbFactory(new MongoClient(), "music");
    }

}
