/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.loyin.model.oa;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.Page;
import net.loyin.jfinal.anatation.TableBind;
import net.loyin.model.sso.Person;
import net.loyin.model.sso.User;

/**
 *
 * @author lethe
 */
@TableBind(name = "oa_notice")
public class Notice extends Model<Notice>{
    public static final String tableName = "oa_notice";
    public static final Notice dao=new Notice();

    public Page<Notice> pageGrid(int pageNo, int pageSize, String relation_id) {
        StringBuilder sql = new StringBuilder(" from ");
        sql.append(tableName);
        sql.append(" t,");
        sql.append(User.tableName);
        sql.append(" u,");
        sql.append(Person.tableName);
        sql.append(" p where p.id=u.id and u.id=t.creater_id and t.relation_id=? order by t.create_datetime desc");
        return dao.paginate(pageNo, pageSize,
                "select t.*,p.realname,u.uname,u.head_img ", sql.toString(),
                relation_id);
    }
}
