package com.steammanager.test;
import java.util.Locale;

import com.github.goive.steamapi.SteamApi;
import com.github.goive.steamapi.data.SteamApp;
import com.github.goive.steamapi.exceptions.SteamApiException;


public class SteamAPITest {

	public static void main(String[] args) {
        // Country codes are always 2 letter. Also possible to use the getCountry() method from Locale
		System.out.println("Current Country:"+Locale.getDefault().getCountry());
        SteamApi steamApi = new SteamApi();

          try {
/*
            // Retrieves a list of all possible steam appIds along with name, in case you want to pre-check
            Map<Integer, String> appList = steamApi.listApps();
            
            Iterator<Map.Entry<Integer, String>> entries = appList.entrySet().iterator();  
            
            while (entries.hasNext()) {  
                Map.Entry<Integer, String> entry = entries.next();  
                System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());  
            }  
*/
            // Fetches information about the steam game including pricing
            SteamApp steamApp = steamApi.retrieve(377160); // by appId (exact match)
			String appStoreURL = "http://store.steampowered.com/app/" + steamApp.getAppId();

            // Use the getters to retrieve data or these convenience methods
			System.out.println("APP ID: " + steamApp.getAppId());
			System.out.println("APP NAME: " + steamApp.getName());
			System.out.println("APP IMAGE: "+ steamApp.getHeaderImage());
			System.out.println("APP CURRENCY:" + steamApp.getPriceCurrency().getSymbol());
			System.out.println("APP PRICE: " + steamApp.getPrice());
			System.out.println("APP INITAL PRICE :"+steamApp.getPriceInitial());
			System.out.println("APP FINAL PRICE: "+steamApp.getPriceFinal());
			System.out.println("APP DISCOUNT: "+ steamApp.getPriceDiscountPercentage());
			System.out.println("APP STORE URL: "+ appStoreURL);
			System.out.println("APP WEBSITE: "+ steamApp.getWebsite());
			System.out.println("APP SUPPORT URL: "+ steamApp.getSupportUrl());
        } catch (SteamApiException e) {
            // Exception needs to be thrown here in case of invalid appId or service downtime
            e.printStackTrace();
        }
    }


}
