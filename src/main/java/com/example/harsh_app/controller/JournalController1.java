package com.example.harsh_app.controller;

import com.example.harsh_app.Entity.JournalEntry;
import com.example.harsh_app.service.JournalEntryService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
// rest controller this annotation is used at class level and allows the class to handle the request made by
// the client. It combines @Controller and @ResponseBody, meaning that the methods in a class annotated with
// @RestController return data directly as a JSON or XML.
@RequestMapping("/journal1")
public class JournalController1 {

    @Autowired
    private JournalEntryService journalEntryService;

    @GetMapping
    public List<JournalEntry> getAll(){
        return journalEntryService.getAll();
    }

    @PostMapping
    public  JournalEntry createEntry(@RequestBody JournalEntry myEntry){
        myEntry.setDate(LocalDateTime.now());
        journalEntryService.saveEntry(myEntry);
        return myEntry;
    }

    @GetMapping("/id/{myId}")
    public JournalEntry getJournalEntryById(@PathVariable ObjectId myId){
        return journalEntryService.findById(myId).orElse(null);
    }
    @DeleteMapping("/id/{myId}")
    public JournalEntry deleteById(@PathVariable Long myId){
        return null;
    }

    @PutMapping("/id/{myId}")
    public JournalEntry updateById(@PathVariable Long myId, @RequestBody JournalEntry myEntry){
        return null;
    }
}
