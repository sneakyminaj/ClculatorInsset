/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.insset.client.service;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 *
 * @author talend
 */
@RemoteServiceRelativePath("solde")
public interface SoldeService extends RemoteService{
     /**
     * Calcul solde
     *
     * @param initialAmount
     * @param percent
     * @return
     * @throws IllegalArgumentException
     */
    
    Double calculSolde(String initAmnt, Integer perc) throws IllegalArgumentException;
}
