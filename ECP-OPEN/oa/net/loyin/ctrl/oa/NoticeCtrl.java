/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.loyin.ctrl.oa;

import net.loyin.ctrl.BaseController;
import net.loyin.jfinal.anatation.RouteBind;
import net.loyin.model.oa.Notice;

/**
 *
 * @author lethe
 */
@RouteBind(path = "notice")
public class NoticeCtrl extends BaseController<Notice> {
    public NoticeCtrl(){
        this.modelClass=Notice.class;
    }
    public void getNoticeList(){
        String test="test";
        this.renderJson(test);
    }
}
