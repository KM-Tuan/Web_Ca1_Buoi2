/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.kmt.hibernatedemov1;

import com.kmt.repository.impl.CategoryRepositoryImpl;
import com.kmt.repository.impl.ProductRepositoryImpl;
import com.kmt.repository.impl.StatsRepositoryImpl;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author admin
 */
public class HibernateDemoV1 {

    public static void main(String[] args) {
        StatsRepositoryImpl s = new StatsRepositoryImpl();
        s.statsRevenuebyProdut().forEach(o -> System.out.printf("%d - %s: %d\n", o[0], o[1], o[2]));
        
//        CategoryRepositoryImpl s = new CategoryRepositoryImpl();
//        s.getCates().forEach(c -> System.out.println(c.getName()));
//        
//        Map<String, String> params = new HashMap<>();
//        params.put("page", "1");
//        params.put("kw", "iPhone");
//        params.put("fromPrice", "30000000");
//        params.put("categoryId", "2");
//        
//        ProductRepositoryImpl s2 = new ProductRepositoryImpl();
//        s2.getProducts(params).forEach(p -> System.out.printf("%d - %s - %d \n", p.getId(), p.getName(), p.getPrice()));
        
    }
}
