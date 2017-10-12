/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.insset.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import org.insset.client.service.SoldeService;

/**
 *
 * @author talend
 */
public class SoldeServiceImpl extends RemoteServiceServlet implements SoldeService{

    @Override
    public Double calculSolde(String initAmnt, Integer perc) throws IllegalArgumentException {
        return 25.01;
    }
    
}

