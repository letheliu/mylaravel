/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.loyin.ctrl.oa;

import net.loyin.ctrl.BaseController;
import net.loyin.jfinal.anatation.RouteBind;
import net.loyin.model.oa.WorkReport;

/**
 *
 * @author lethe
 */
@RouteBind(path="workreport")
public class WorkReportCtrl extends BaseController<WorkReport> {
    public WorkReportCtrl(){
        this.modelClass=WorkReport.class;
    }
}
