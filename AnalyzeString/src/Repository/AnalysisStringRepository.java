/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import DataAccess.AnalysisStringDAO;

/**
 *
 * @author Asus
 */
public class AnalysisStringRepository implements IAnalysisStringRepository{

    @Override
    public void analysisString() {
        AnalysisStringDAO.Instance().analysisString();
    }
           
}
