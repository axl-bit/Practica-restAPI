package pe.edu.idat.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import pe.edu.idat.util.DBConnection;
import pe.edu.idat.ECFinal_Villar_Axel.operationsVO;
import pe.edu.idat.ECFinal_Villar_Axel.userVO;

public class operationsDAO {
    
    
    public int findbyUP(String username, String pass){
        
        int resultado = -1;
        Connection cn;
        PreparedStatement stm;
        ResultSet rs;
        
        try {
            
            cn = DBConnection.getConnection();
            stm = cn.prepareStatement("select * from user where username = ? and pass = ?");
            stm.setString(1, username);
            stm.setString(2, pass);
            rs = stm.executeQuery();
            
            if(rs.next()){
                System.err.println("Ingresando a rest api");
                resultado = 1;
            }
            else{
                System.out.println("No se puede ingresar a la api");
            }
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        return resultado;
        
    }
    
    public List<operationsVO> findAll(){
        
        List<operationsVO> lista = new ArrayList<>();
        Connection cn;
        PreparedStatement stm;
        ResultSet rs;
        
        try {
            
            cn = DBConnection.getConnection();
            stm = cn.prepareStatement("Select * From operations");
            rs = stm.executeQuery();
            
            while(rs.next()){
                
                operationsVO vo = new operationsVO();
                
                vo.setId(rs.getInt("id"));
                vo.setClient(rs.getString("client"));
                vo.setCreditcard_number(rs.getString("creditcard_number"));
                vo.setCreditcard_type(rs.getString("creditcard_type"));
                vo.setAmount(rs.getDouble("amount"));
                vo.setCurrency(rs.getString("currency"));
                vo.setCommerce(rs.getString("commerce"));
                vo.setCountry(rs.getString("country"));
                
                lista.add(vo);
                        
            }
                    
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return lista;
        
    }
    
    
    public List<operationsVO> findByCCT(String creditcard_type){
        
        
        List<operationsVO> lista = new ArrayList<>();
        Connection cn;
        PreparedStatement stm;
        ResultSet rs;
        
        try {
            
            cn = DBConnection.getConnection();
            stm = cn.prepareStatement("Select * From operations where creditcard_type = ?");
            stm.setString(1, creditcard_type);
            rs = stm.executeQuery();
            
            while(rs.next()){
                
                operationsVO vo = new operationsVO();
                
                vo.setId(rs.getInt("id"));
                vo.setClient(rs.getString("client"));
                vo.setCreditcard_number(rs.getString("creditcard_number"));
                vo.setCreditcard_type(rs.getString("creditcard_type"));
                vo.setAmount(rs.getDouble("amount"));
                vo.setCurrency(rs.getString("currency"));
                vo.setCommerce(rs.getString("commerce"));
                vo.setCountry(rs.getString("country"));
                
                lista.add(vo);
                        
            }
                    
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return lista;
        
    }
    
    public List<operationsVO> findByCountry(String country){
        
        
        List<operationsVO> lista = new ArrayList<>();
        Connection cn;
        PreparedStatement stm;
        ResultSet rs;
        
        try {
            
            cn = DBConnection.getConnection();
            stm = cn.prepareStatement("Select * From operations where country = ?");
            stm.setString(1, country);
            rs = stm.executeQuery();
            
            while(rs.next()){
                
                operationsVO vo = new operationsVO();
                
                vo.setId(rs.getInt("id"));
                vo.setClient(rs.getString("client"));
                vo.setCreditcard_number(rs.getString("creditcard_number"));
                vo.setCreditcard_type(rs.getString("creditcard_type"));
                vo.setAmount(rs.getDouble("amount"));
                vo.setCurrency(rs.getString("currency"));
                vo.setCommerce(rs.getString("commerce"));
                vo.setCountry(rs.getString("country"));
                
                lista.add(vo);
                        
            }
                    
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return lista;
        
    }
    
    
    public int addoperations(operationsVO op){
        int resultado = -1;
        Connection cn;
        PreparedStatement stm;
        
        try {
            
            cn = DBConnection.getConnection();
            stm = cn.prepareStatement("insert into operations values(?,?,?,?,?,?,?,?)");
            stm.setInt(1, 0); //esto esta puesto por que la base de datos es auto incremetable pero no permite null por eso eh puesto esto.
            stm.setString(2, op.getClient());
            stm.setString(3, op.getCreditcard_number());
            stm.setString(4, op.getCreditcard_type());
            stm.setDouble(5, op.getAmount());
            stm.setString(6, op.getCurrency());
            stm.setString(7, op.getCommerce());
            stm.setString(8, op.getCountry());
                        
            resultado = stm.executeUpdate();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return resultado;
        
    }
    
}
