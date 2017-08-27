package com.steammanager.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.github.goive.steamapi.SteamApi;
import com.github.goive.steamapi.data.SteamApp;
import com.github.goive.steamapi.exceptions.SteamApiException;

public class SteamJDBC {

	public static void main(String[] args){
    	   //声明Connection对象
           Connection con;
           //驱动程序名
           String driver = "com.mysql.jdbc.Driver";
           //URL指向要访问的数据库名mydata
           String url = "jdbc:mysql://localhost:3306/sm";
           //MySQL配置时的用户名
           String user = "admin";
           //MySQL配置时的密码
           String password = "admin";
           //遍历查询结果集
           try {
               //加载驱动程序
               Class.forName(driver);
               //1.getConnection()方法，连接MySQL数据库！！
               con = DriverManager.getConnection(url,user,password);
               if(!con.isClosed())
                   System.out.println("Succeeded connecting to the Database!");
               //2.创建statement类对象，用来执行SQL语句！！
               Statement statement = con.createStatement();
               //要执行的SQL语句
               String selectsql = "select * from app";
               //3.ResultSet类，用来存放获取的结果集！！
               ResultSet rs = statement.executeQuery(selectsql);
               System.out.println("-----------------");
               System.out.println("执行结果如下所示:");  
               System.out.println("-----------------");
                
               //4.处理Steam接口
        	   SteamApi steamApi = new SteamApi();
               int appId;
               int i = 0;
               while(rs.next()){
                   //获取app_id这列数据
                   appId = rs.getInt("app_id");
   
				   try {
						// Fetches information about the steam game including pricing
						SteamApp steamApp = steamApi.retrieve(appId); // by appId (exact match)
						
						String appName = steamApp.getName();
						String appImage = steamApp.getHeaderImage();
						double Price = steamApp.getPrice();
						double appInitalPrice = steamApp.getPriceInitial();
						double appDiscount = steamApp.getPriceDiscountPercentage();
						//String appStoreURL = "http://store.steampowered.com/app/" + steamApp.getAppId();

						// Use the getters to retrieve data or these convenience methods
						System.out.println("APP ID: " + appId);
						System.out.println("APP NAME: " + steamApp.getName());
						/*System.out.println("APP IMAGE: "+ steamApp.getHeaderImage());
						System.out.println("APP CURRENCY: CNY");
						//System.out.println("APP CURRENCY:" + steamApp.getPriceCurrency().getSymbol());
						System.out.println("APP PRICE: " + steamApp.getPrice());
						System.out.println("APP INITAL PRICE :"+steamApp.getPriceInitial());
						System.out.println("APP FINAL PRICE: "+steamApp.getPriceFinal());
						System.out.println("APP DISCOUNT: "+ steamApp.getPriceDiscountPercentage());
						System.out.println("APP STORE URL: "+ appStoreURL);
						System.out.println("APP WEBSITE: "+ steamApp.getWebsite());
						System.out.println("APP SUPPORT URL: "+ steamApp.getSupportUrl());*/
						
					    String insertsql = "update app set app_name = ? ,app_image = ? ,app_price = ? ,app_inital = ? ,app_discount = ? where app_id = ? ";
					    PreparedStatement pstmt;
					    try {
					        pstmt = (PreparedStatement) con.prepareStatement(insertsql);
					        pstmt.setString(1, appName);
					        pstmt.setString(2, appImage);
					        pstmt.setInt(3, (int)Price);
					        pstmt.setInt(4, (int)appInitalPrice);
					        pstmt.setInt(5, (int)appDiscount);
					        pstmt.setInt(6, appId);
					        pstmt.executeUpdate();
					        pstmt.close();
					        i++;
					        System.out.println("序号 "+ i +"  本条数据修改成功");
					    } catch (SQLException e) {
					        e.printStackTrace();
					        continue;
					    } finally{
							try   
							{   
								Thread.currentThread();
								Thread.sleep(1000);//ms
							}   
							catch(Exception e){}  
							}

					} catch (SteamApiException e) {
						// Exception needs to be thrown here in case of invalid appId or service downtime
						e.printStackTrace();
						continue;
					} 
               }
               rs.close();
               con.close();
           } catch(ClassNotFoundException e) {   
               //数据库驱动类异常处理
               System.out.println("Sorry,can`t find the Driver!");   
               e.printStackTrace();   
               } catch(SQLException e) {
               //数据库连接失败异常处理
               e.printStackTrace();  
               }catch (Exception e) {
               // TODO: handle exception
               e.printStackTrace();
           }finally{
               System.out.println("数据库保存成功");
           }


	}

}
