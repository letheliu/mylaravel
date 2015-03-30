/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.loyin.ctrl.oa;

import net.loyin.ctrl.BaseController;
import net.loyin.jfinal.anatation.RouteBind;
import net.loyin.model.oa.EventModel;

/**
 *
 * @author lethe
 */
@RouteBind(path="event")
public class EventCtrl extends BaseController<EventModel>{
    public EventCtrl(){
        this.modelClass=EventModel.class;
    }
}
