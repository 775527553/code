<#include "/macro.include"/>
<#assign className = table.className>
<#assign classNameLower = className?uncap_first>
package ${basepackage}.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * ${table.sqlName}
 * @author WD
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ${className} {

    <#list table.columns as column>
        /**
         * ${column.remarks}
         */
        private ${column.javaType} ${column.columnNameLower};
    </#list>


}