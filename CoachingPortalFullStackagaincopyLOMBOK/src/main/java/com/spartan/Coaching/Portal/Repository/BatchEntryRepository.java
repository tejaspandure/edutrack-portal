package com.spartan.Coaching.Portal.Repository;

import com.spartan.Coaching.Portal.Entity.BatchEntry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BatchEntryRepository extends MongoRepository<BatchEntry, ObjectId>
{

}
