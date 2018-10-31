<#include "/macro.include"/>
<#assign className = table.className>
<#assign classNameLower = className?uncap_first>
package ${basepackage}.dao;

import ${basepackage}.entity.${className};

import java.util.List;

/**
 * ${table.sqlName}
 * @author WD
 * ${now?string('yyyy/MM/dd HH:mm:ss')}
 */
public interface ${className}Dao  {

    int  delete(String id);

    int insert(${className} ${classNameLower});

    ${className}  get(String id);

    List<${className}>  find(${className} ${classNameLower});

    int  update(${className} ${classNameLower});
}