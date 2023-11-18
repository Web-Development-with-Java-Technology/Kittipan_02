package nvc.it.kittipan.first.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestBody;

@Controller     //@ = Annotation
public class MainController {

    @GetMapping("/") 
    @ResponseBody
    public String index(){
        return "<h1>INDEX</h1>";
    }

    @GetMapping("/about") 
    @ResponseBody
    public String about(){
        return "<h1>ABOUT</h1>";
    }
// ------ Overload : because parameter don't macth -------
    @GetMapping("/product") 
    @ResponseBody
    public String product(){
        return "<h1>PRODUCT</h1>";
    }

    @GetMapping("/product/{id}")
    @ResponseBody
    public String product(@PathVariable int id){
      return "<h1>Product</h1> <p>ID: " + id + "</p>";
    }

    @GetMapping("/product/name/{name}")
    @ResponseBody
    public String product(@PathVariable String name){
      return "<h1>Product</h1> <p>NAME: " + name + "</p>";
    }
// ------ Overload : because parameter don't macth -------
    
    @GetMapping("/contact") 
    @ResponseBody
    public String contact(){
        return "<h1>CONTACT</h1>";
    }

    @PostMapping("/product")
    @ResponseBody
    public String createProduct(@RequestBody String name){
        return "Create Product Complete, Name: " + name;
    }

}
