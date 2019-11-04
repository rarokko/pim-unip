package com.unip.pimfrotas.controller;
 
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.unip.pimfrotas.model.Carro;
import com.unip.pimfrotas.model.User;
 
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
import org.springframework.web.server.handler.ExceptionHandlingWebHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
@RequestMapping("/api/v1")

public class Routesv1 {

  DbConnection db = new DbConnection();
  Connection conn = null;
  PreparedStatement preparedStatement = null;
  Statement stmt = null;
  ResultSet rs = null;
  String query = "";
  
  @PostMapping("/registerUser")
  public String registerUser(@RequestBody User user) {
    String nomeDoUsuario = user.getNomeDoUsuario();
    String senha = user.getSenha();
    query = "INSERT INTO MecFrotas.LOGIN VALUES ('" + nomeDoUsuario + "', '" + senha + "')";
    rs = db.query(query);
    return HttpStatus.OK.toString();
  };
  
  @PostMapping("/loginUser")
  public String loginUser(@RequestBody User user) {
    String nomeDoUsuario = user.getNomeDoUsuario();
    String senha = user.getSenha();
    query = "SELECT NomeDoUsuario, Senha FROM MecFrotas.LOGIN WHERE NomeDoUsuario = '" + nomeDoUsuario + "' AND Senha = '" + senha + "'";
    rs = db.query(query);
    try {
      int count = 0;
      while (rs.next()) {
          ++count;
      }
      if (count == 0) {
        return HttpStatus.FORBIDDEN.toString();
      } else {
        return HttpStatus.OK.toString();
      }
    } catch (SQLException ex) {
      System.out.println("VendorError: " + ex.getErrorCode());
      return HttpStatus.INTERNAL_SERVER_ERROR.toString();
    }

  };

  @GetMapping("/frota")
  public String getFrota() {
    // conn = db.connect();
    // try {
    //   stmt = conn.createStatement();
    //   query = "SELECT * FROM MecFrotas.LOGIN";
    //   stmt.execute(query);
    //   rs = stmt.getResultSet();
    //   System.out.println(rs);
    // } catch (SQLException ex) {
    //   System.out.println("SQLException: " + ex.getMessage());
    //   System.out.println("SQLState: " + ex.getSQLState());
    //   System.out.println("VendorError: " + ex.getErrorCode());
    // }
      return HttpStatus.OK.toString();
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
