/*
package com.example.harsh_app.controller;

import com.example.harsh_app.Entity.JournalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
// rest controller this annotation is used at class level and allows the class to handle the request made by
// the client. It combines @Controller and @ResponseBody, meaning that the methods in a class annotated with
// @RestController return data directly as a JSON or XML.
@RequestMapping("/journal")
public class JournalController {

     private Map<String, JournalEntry> JournalEntries = new HashMap<>();
     @GetMapping
     public List<JournalEntry> getAll(){
          return new ArrayList<>(JournalEntries.values());
      }

      @PostMapping
    public  boolean createEntry(@RequestBody JournalEntry myEntry){
         JournalEntries.put(myEntry.getId(),myEntry );
         return true;
      }

      @GetMapping("/id/{myId}")
      public JournalEntry getById(@PathVariable String myId){
         return JournalEntries.get(myId);
      }
      @DeleteMapping("/id/{myId}")
      public JournalEntry deleteById(@PathVariable String myId){
         return JournalEntries.remove(myId);
      }

      @PutMapping("/id/{myId}")
      public JournalEntry updateById(@PathVariable String myId, @RequestBody JournalEntry myEntry){
          return JournalEntries.put(myId,myEntry);
      }
}
*/
