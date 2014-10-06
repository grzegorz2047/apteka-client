/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class MysqlHandler {

	public static String  url= "jdbc:mysql://127.0.0.1:3306/";
        static Connection conn;
        static String login;
        static String haslo;
	public static void PrzypiszDane(String ip, String port, String login, String haslo){
            MysqlHandler.login = login;
            MysqlHandler.haslo = haslo;
            url = "jdbc:mysql://" + ip +":"+ port+"/apteka";
	}
    
    public void  execute() throws Exception {

        /*
         * The following code is what would actually be in your
         * Servlet, JSP or EJB 'service' method...where you need
         * to work with a JDBC connection.
         */

        Connection conn = null;
        Statement stmt = null;

        
        try {

            /*
             * Now, use normal JDBC programming to work with
             * MySQL, making sure to close each resource when you're
             * finished with it, which permits the connection pool
             * resources to be recovered as quickly as possible
             */

            stmt = conn.createStatement();
            stmt.execute("SOME SQL QUERY");

            stmt.close();
            stmt = null;

            conn.close();
            conn = null;
        } finally {
            /*
             * close any jdbc instances here that weren't
             * explicitly closed during normal code path, so
             * that we don't 'leak' resources...
             */

            if (stmt != null) {
                try {
                    stmt.close();
                } catch (Exception sqlex) {
                    // ignore, as we can't do anything about it here
                }

                stmt = null;
            }

            if (conn != null) {
                try {
                    conn.close();
                } catch (Exception sqlex) {
                    // ignore, as we can't do anything about it here
                }

                conn = null;
            }
        }
    }
    
    public static void dodajRekordPracownik(String imie, String nazwisko, String tytul) throws Exception {

        Statement stmt = null;

        try {
            conn = DriverManager.getConnection(url, login, haslo);
            
        stmt = conn.createStatement();
        stmt.executeUpdate("INSERT INTO pracownik VALUES (0, '"+imie+"' , '"+nazwisko+"' , '"+tytul+"')");
        System.out.println("Rekord zostal utworzony");

        stmt.close();
        stmt = null;

        } finally {


            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException sqlex) {
                    // ignore -- as we can't do anything about it here
                }

                stmt = null;
            }

        }
    }
}