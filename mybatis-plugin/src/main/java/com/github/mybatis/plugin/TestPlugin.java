package com.github.mybatis.plugin;

import org.mybatis.generator.api.GeneratedXmlFile;
import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.*;
import org.mybatis.generator.api.dom.xml.*;
import org.mybatis.generator.codegen.XmlConstants;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by zachary on 2017/4/13.
 */
public class TestPlugin extends PluginAdapter {

    public boolean validate(List<String> list) {
        return true;
    }

    @Override
    public boolean modelExampleClassGenerated(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        super.modelExampleClassGenerated(topLevelClass, introspectedTable);
        InnerClass criteria = null;
        // first, find the Criteria inner class
        for (InnerClass innerClass : topLevelClass.getInnerClasses()) {
            if ("Criteria".equals(innerClass.getType().getShortName())) { //$NON-NLS-1$
                criteria = innerClass;
                break;
            }
        }
        Method method = new Method();
        method.setName("andMap");
        method.setVisibility(JavaVisibility.PUBLIC);
        method.setReturnType(FullyQualifiedJavaType.getCriteriaInstance());

        FullyQualifiedJavaType newMapInstance = FullyQualifiedJavaType.getNewMapInstance();
        newMapInstance.addTypeArgument(FullyQualifiedJavaType.getStringInstance());
        newMapInstance.addTypeArgument(FullyQualifiedJavaType.getObjectInstance());
        Parameter parameter = new Parameter(newMapInstance,"map");
        method.addParameter(parameter);



        for (IntrospectedColumn column : introspectedTable.getAllColumns()){
            String upperCasePropertyName = column.getJavaProperty();
            char[] name = upperCasePropertyName.toCharArray();
            name[0]-=32;
            upperCasePropertyName = String.valueOf(name);

            method.addBodyLine("if (map.containsKey(\""+ upperCasePropertyName +"EqualTo\")){");
            method.addBodyLine(" and"+upperCasePropertyName+"EqualTo(("+column.getFullyQualifiedJavaType().getShortName()+") map.get(\""+ upperCasePropertyName +"EqualTo\"));");
            method.addBodyLine("}");
        }


        method.addBodyLine("return this;");
        criteria.addMethod(method);

        context.getCommentGenerator()
                .addGeneralMethodComment(method,introspectedTable);

        return true;
    }

    //    @Override
//    public boolean sqlMapDocumentGenerated(Document document, IntrospectedTable introspectedTable) {
//        super.sqlMapDocumentGenerated(document, introspectedTable);
//        XmlElement xmlElement = new XmlElement("select");
//
//        xmlElement.addAttribute(new Attribute("id","selectByMap"));
//        xmlElement.addAttribute(new Attribute("resultMap","BaseResultMap"));
//        xmlElement.addElement(new TextElement("select"));
//        XmlElement includeXmlElement = new XmlElement("include");
//        includeXmlElement.addAttribute(new Attribute("refid","Base_Column_List"));
//        xmlElement.addElement(includeXmlElement);
//        xmlElement.addElement(new TextElement("from "+introspectedTable.getTableConfiguration().getTableName()));
//
//        document.getRootElement().addElement( xmlElement);
//        return true;
//    }
}
