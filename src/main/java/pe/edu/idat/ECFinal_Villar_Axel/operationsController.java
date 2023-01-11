package pe.edu.idat.ECFinal_Villar_Axel;

import java.util.ArrayList;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.idat.dao.operationsDAO;

@RestController
@RequestMapping("api/operations")
public class operationsController {
    
    operationsDAO dao = new operationsDAO();
    
    @GetMapping
    public ResponseEntity<List<operationsVO>> listartodo(@RequestHeader String Token){
        
        List<operationsVO> temp = new ArrayList<>();
        
        if(Token != null && Token.equals("b68e0a58-e699-4551-9490-8dd5cedeaa0e")){
            temp = dao.findAll();
        return new ResponseEntity<>(temp, HttpStatus.OK);
        }
        else
            return new ResponseEntity<>(temp , HttpStatus.NOT_FOUND);
        
    }
    
    @GetMapping({"/CCT/{creditcard_type}"})
    public ResponseEntity<List<operationsVO>> listarPorCCT(@PathVariable String creditcard_type){
        
        List<operationsVO> temp = new ArrayList<>();
        temp = dao.findByCCT(creditcard_type);
        return new ResponseEntity<>(temp, HttpStatus.OK);
        
    }
    
    @GetMapping({"/Country/{country}"})
    public ResponseEntity<List<operationsVO>> listarPorCountry(@PathVariable String country, @RequestHeader String username, @RequestHeader String pass){
        
        List<operationsVO> temp = new ArrayList<>();
        
        int user = 0;
        
        user = dao.findbyUP(username, pass);
        
        System.out.println("usuario y contraseña : " + username + " " + pass);
        System.out.println("user : " + user);
        
        if(user == 1 && user != 0){
            temp = dao.findByCountry(country);
            return new ResponseEntity<>(temp , HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
        
        
        
    }
    
    @PostMapping
    public ResponseEntity<operationsVO> registrar(@RequestBody operationsVO o){
        
        dao.addoperations(o);
        return new ResponseEntity<>(o, HttpStatus.CREATED);
        
    }
    
}
