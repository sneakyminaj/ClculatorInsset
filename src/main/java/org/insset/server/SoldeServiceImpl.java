/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.insset.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import org.insset.client.service.SoldeService;

/**
 *
 * @author talend
 */
public class SoldeServiceImpl extends RemoteServiceServlet implements SoldeService{

    @Override
    public Double calculSolde(String initAmnt, Integer perc) throws IllegalArgumentException {
        DecimalFormat hisFormat = new DecimalFormat("######.##");
        hisFormat.setRoundingMode(RoundingMode.DOWN);
        return Double.parseDouble(hisFormat.format( Double.parseDouble(initAmnt) * ( 1 - (perc/100.0) )));
    }
}

