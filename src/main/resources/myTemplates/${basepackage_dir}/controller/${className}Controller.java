<#include "/macro.include"/>
<#assign className = table.className>
<#assign classNameLower = className?uncap_first>
package ${basepackage}.controller;

import ${basepackage}.entity.${className};
import ${basepackage}.service.${className}Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;


import java.util.List;

/**
 * ${table.sqlName}
 * @author WD
 *
 */
@RestController
@RequestMapping("/${classNameLower}")
public class  ${className}Controller  {

    @Autowired
    private ${className}Service ${classNameLower}Service;

    @RequestMapping(value ="/delete",method = RequestMethod.POST)
    public int  delete(String id){
        return   ${classNameLower}Service.delete(id);
    }

    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public int save(${className} ${classNameLower}){
        return ${classNameLower}Service.save(${classNameLower});
    }

    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public ${className}  get(String id){
        return ${classNameLower}Service.get(id);
    }

    @RequestMapping(value = "/find",method = RequestMethod.POST)
    public List<${className}>  find(${className} ${classNameLower}){
        return ${classNameLower}Service.find(${classNameLower});
    }
}