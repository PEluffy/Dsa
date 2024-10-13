package searchbox.demo;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("api/trie")
public class TrieController {

    private final Trie trie;

    public TrieController(Trie trie) {
        this.trie = trie;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/insert")
    public ResponseEntity<String> insert(@RequestBody Name name) {
        String insertedName = name.getName();
        System.out.println(insertedName);
        trie.insert(insertedName);
        return ResponseEntity.ok("Name inserted successfully");
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/search")
    public ResponseEntity<List<String>> search(@RequestParam String prefix) {
        List<String> result = trie.searchByPrefix(prefix);
        return ResponseEntity.ok(result);
    }

}
