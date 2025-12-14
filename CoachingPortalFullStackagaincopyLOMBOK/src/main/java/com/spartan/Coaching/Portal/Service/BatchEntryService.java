package com.spartan.Coaching.Portal.Service;


import com.spartan.Coaching.Portal.Entity.BatchEntry;
import com.spartan.Coaching.Portal.Repository.BatchEntryRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class BatchEntryService
{
    @Autowired
    private BatchEntryRepository batchEntryRepository;

    //C
    //POST
    public void saveEntry(BatchEntry batchEntry)
    {
        batchEntryRepository.save(batchEntry);
    }

    //R
    //Get
    public List<BatchEntry> getAll()
    {
        return batchEntryRepository.findAll();
    }

    //R
    //Get
    public Optional<BatchEntry> findById(ObjectId id)
    {
        return batchEntryRepository.findById(id);
    }

    //D
    //Delete
    public boolean deleteById(ObjectId id)
    {
        batchEntryRepository.deleteById(id);
        return true;
    }




}
