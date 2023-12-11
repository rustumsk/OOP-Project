package OOP_Project.model.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class Data extends Connect {
    /* 
    public void connectData(){
        try{
            Connection connection = getConnection();
            if(connection != null){
                String query = "SELECT userId,userName FROM demo.user";
                try(PreparedStatement preparedStatement = connection.prepareStatement(query);
                ResultSet resultSet = preparedStatement.executeQuery()){
                    while(resultSet.next()){
                        int id = resultSet.getInt("userId");
                        String name = resultSet.getString("userName");
                        System.out.print(name + " ");
                        System.out.println(id);
                    }
                }
            }
        }
        catch(SQLException e){

        }
    }
    */
}
