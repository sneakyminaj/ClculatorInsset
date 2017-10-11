/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.insset.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import org.insset.client.service.RomanConverterService;

/**
 *
 * @author user
 */
@SuppressWarnings("serial")
public class RomanConverterServiceImpl extends RemoteServiceServlet implements
        RomanConverterService {
    
    private static final Map<Character, Integer> mapRtA = new HashMap<>(7);
    private static final TreeMap<Integer, String> mapAtR = new TreeMap<>(Collections.reverseOrder());
    static {
        mapAtR.put(1000, "M");
        mapAtR.put(900, "CM");
        mapAtR.put(500, "D");
        mapAtR.put(400, "CD");
        mapAtR.put(100, "C");
        mapAtR.put(90, "XC");
        mapAtR.put(50, "L");
        mapAtR.put(40, "XL");
        mapAtR.put(10, "X");
        mapAtR.put(9, "IX");
        mapAtR.put(5, "V");
        mapAtR.put(4, "IV");
        mapAtR.put(1, "I");
    }
    static {
        mapRtA.put('I', 1);
        mapRtA.put('V', 5);
        mapRtA.put('X', 10);
        mapRtA.put('L', 50);
        mapRtA.put('C', 100);
        mapRtA.put('D', 500);
        mapRtA.put('M', 1000);
    }
    @Override
    public String convertDateYears(String nbr) throws IllegalArgumentException {
        
        return "XV/III/MX";
    }

    @Override
    public Integer convertRomanToArabe(String nbr) throws IllegalArgumentException {
        int sum = 0;
        int len = nbr.length() - 1;
        for (int i = 0; i < len; i++) {
            if (mapRtA.get(nbr.charAt(i)) < mapRtA.get(nbr.charAt(i + 1))) {
                sum -= mapRtA.get(nbr.charAt(i));
            } else {
                sum += mapRtA.get(nbr.charAt(i));
            }
        }
        return sum += mapRtA.get(nbr.charAt(len));
    }

    @Override
    public String convertArabeToRoman(Integer nbr) throws IllegalArgumentException {
            StringBuilder roman = new StringBuilder("");
        for (Integer i: mapAtR.keySet()) {
            for (int j = 1; j <= nbr / i; j++) {
                roman.append(mapAtR.get(i));
            }
            nbr %= i;
        }
        return roman.toString();
    }

}
