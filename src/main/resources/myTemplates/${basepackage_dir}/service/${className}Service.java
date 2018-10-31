<#include "/macro.include"/>
<#assign className = table.className>
<#assign classNameLower = className?uncap_first>
package ${basepackage}.service;

import ${basepackage}.dao.${className}Dao;
import ${basepackage}.entity.${className};
import org.springframework.util.StringUtils;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



/**
 * ${table.sqlName}
 * @author WD
 *
 */
@Service
public class ${className}Service {

    @Autowired
    private ${className}Dao ${classNameLower}Dao;


    public int  delete(String id){
        return   ${classNameLower}Dao.delete(id);
    }

    public int save(${className} ${classNameLower}){
        if(StringUtils.isEmpty(${classNameLower}.getId())){
            return ${classNameLower}Dao.insert(${classNameLower});
        }
        return ${classNameLower}Dao.update(${classNameLower});
    }

    public ${className}  get(String id){
        return ${classNameLower}Dao.get(id);
    }

    public List<${className}>  find(${className} ${classNameLower}){
        return ${classNameLower}Dao.find(${classNameLower});
    }




}