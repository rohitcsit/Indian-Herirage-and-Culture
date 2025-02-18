package com.klu.Controller;

/*
 * package com.klu.Controller;
 * 
 * import org.springframework.stereotype.Controller; import
 * org.springframework.web.bind.annotation.GetMapping;
 * 
 * @Controller 
 * public class culture {
 * 
 * @GetMapping("/helo") 
 * public String hello() {
 * 
 * return "index"; // This corresponds to the name of your HTML file
 * (index.html) } }
 * 
 * 
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
/*import org.springframework.web.bind.annotation.RestController;*/

@Controller
/* @RestController */
public class culture  {
	@GetMapping("/") 
	  public String index() {
	 return "index";
	}

    @GetMapping("/tourism")
    public String tourism() {
        return "tourism";
    }

    @GetMapping("/art_forms")
    public String art_form() { 
        return "art_forms";
    }

    @GetMapping("/monuments")
    public String monuments() {
        return "monuments";
    }

    @GetMapping("/temple")
    public String temple() {
        return "temple";
    }

    @GetMapping("/dance")
    public String dance() {
        return "dance";
    }

    @GetMapping("/modern")
    public String modern() {
        return "modern";
    }
  
    @GetMapping("/frontliners")
    public String frontliners() {
        return "frontliners";
    }

    @GetMapping("/Calendar")
    public String Calendar() {
        return "Calendar";
    }

    @GetMapping("/food")
    public String food() {
        return "food";
    }
}







/*
 * @Autowired private UserRepository userRepository;
 * 
 * @PostMapping("/registration") public String
 * processRegistration(@ModelAttribute User form) { // Check if the username is
 * already taken if (userRepository.findByUsername(form.getUsername()) != null)
 * { // Handle username conflict return "register"; } else { // Create a new
 * user entity and save it User user = new User();
 * user.setUsername(form.getUsername()); user.setPassword(form.getPassword());
 * user.setEmail(form.getEmail()); userRepository.save(user); return
 * "redirect:/login"; // Redirect to the login page after successful
 * registration } // Return to registration page with an error message } }
 * 
 */