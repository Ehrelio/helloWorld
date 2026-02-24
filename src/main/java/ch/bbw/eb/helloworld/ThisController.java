package ch.bbw.eb.helloworld;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThisController {
    private static final Logger log = LoggerFactory.getLogger(ThisController.class);

    @GetMapping("/helloWorld")
    public ResponseEntity<String> helloWorld() {
        log.info("Hello World Application");

        return ResponseEntity.ok("Hello World");
    }
}
