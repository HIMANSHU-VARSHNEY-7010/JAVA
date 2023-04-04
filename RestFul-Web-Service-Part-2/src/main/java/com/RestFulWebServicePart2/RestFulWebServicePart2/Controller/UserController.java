package com.RestFulWebServicePart2.RestFulWebServicePart2.Controller;


import com.RestFulWebServicePart2.RestFulWebServicePart2.Entity.User;
import com.RestFulWebServicePart2.RestFulWebServicePart2.Entity.UserDTO;
import com.RestFulWebServicePart2.RestFulWebServicePart2.Service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    @Operation(summary = "Get Details of all Users.")
    @GetMapping("/users")
    public List<User> findAllUser() {
        return userService.findAll();
    }

    @Operation(summary = "Get Users on the basis of Id")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Found the User",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = User.class)) }),
            @ApiResponse(responseCode = "404", description = "User not found, Invalid id supplied.",
                    content = @Content) })
    @GetMapping("/users/{userId}")
    public User findUser(@Parameter(description = "Id of the Employee") @PathVariable int userId) {
        return userService.findUser(userId);
    }
    @Operation(summary = "Delete Users on the basis of Id")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Found and deleted the User",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = User.class)) }),
            @ApiResponse(responseCode = "404", description = "User not found, Invalid id supplied.",
                    content = @Content) })
    @DeleteMapping("/users/{userId}")
    public void deleteUser(@Parameter(description = "Id of the Employee") @PathVariable int userId) {
        userService.deleteUser(userId);
    }
    @Operation(summary = "Post Users Details")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Post Successfully.",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = User.class)) }) })
    @PostMapping("/users")
    public User createUser(@RequestBody UserDTO userDTO) {
        return userService.createUser(userDTO);
    }
    @GetMapping("/users2")
    public MappingJacksonValue getAllUser(){
        return userService.dynamicFiltering();
    }
    @GetMapping("/users1/{id}")
    public EntityModel<User> SingleUsers(@PathVariable int id){

        User user = userService.findUser(id) ;

        EntityModel<User>entityModel = EntityModel.of(user) ;
        WebMvcLinkBuilder link = linkTo(methodOn(this.getClass()).findAllUser());
        entityModel.add(link.withRel("All_Users")) ;

        return  entityModel ;
    }
}
