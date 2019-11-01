package com.unip.pimfrotas.controller;
 
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.unip.pimfrotas.model.Carro;
 
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
@RequestMapping("/api/v1")

public class Routesv1 {
//   @Autowired

  /**
   * Obter frota.
   *
   * @param 
   * @return frota baseado em parametros enviados pela requisição
   */
  @GetMapping("/frota")
  public String getFrota() {

    // return HttpStatus.OK.toString();
    return "Gabriel";
  };

  @PostMapping("/frota")
  public String insertFrota(@RequestBody Carro carro) {
    return carro.toString();
  };

}
  
//   /**
//    * Create user user.
//    *
//    * @param user the user
//    * @return the user
//    */
//   @PostMapping("/users")
//   public User createUser(@Valid @RequestBody User user) {
//     return userRepository.save(user);
//   }


//   /**
//    * Update user response entity.
//    *
//    * @param userId the user id
//    * @param userDetails the user details
//    * @return the response entity
//    * @throws ResourceNotFoundException the resource not found exception
//    */
//   @PutMapping("/users/{id}")
//   public ResponseEntity<User> updateUser(
//       @PathVariable(value = "id") Long userId, @Valid @RequestBody User userDetails)
//       throws ResourceNotFoundException {
//     User user =
//         userRepository
//             .findById(userId)
//             .orElseThrow(() -> new ResourceNotFoundException("User not found on :: " + userId));
//     user.setEmail(userDetails.getEmail());
//     user.setLastName(userDetails.getLastName());
//     user.setFirstName(userDetails.getFirstName());
//     user.setUpdatedAt(new Date());
//     final User updatedUser = userRepository.save(user);
//     return ResponseEntity.ok(updatedUser);
//   }
