package api.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

public interface TradingRepository extends MongoRepository<TradingPlatform, Integer> {


}
