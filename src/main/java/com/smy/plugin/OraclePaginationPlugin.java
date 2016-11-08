package com.smy.plugin;

import java.util.List;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.java.JavaVisibility;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.java.Parameter;
import org.mybatis.generator.api.dom.java.TopLevelClass;
import org.mybatis.generator.api.dom.xml.Attribute;
import org.mybatis.generator.api.dom.xml.Document;
import org.mybatis.generator.api.dom.xml.TextElement;
import org.mybatis.generator.api.dom.xml.XmlElement;

public class OraclePaginationPlugin extends PluginAdapter {

	private String daoPackag = "com.smy.cts.dao";
	private String suffixDao = "Dao";

	@Override
	public boolean modelExampleClassGenerated(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
		FullyQualifiedJavaType intType = FullyQualifiedJavaType.getIntInstance();
		FullyQualifiedJavaType booleanType = FullyQualifiedJavaType.getBooleanPrimitiveInstance();
		addField("pageFlag", booleanType, topLevelClass, "//鍒嗛〉鏌ヨ璁剧疆涓簍rue");
		addField("pageStart", intType, topLevelClass, "//鍒嗛〉鏌ヨ璧峰璁板綍鏁帮紝寮�尯闂�");
		addField("pageEnd", intType, topLevelClass, "//鍒嗛〉鏌ヨ缁撴潫璁板綍鏁帮紝闂尯闂�");
		topLevelClass.addSuperInterface(new FullyQualifiedJavaType("com.lz.framework.core.support.IBaseCriteria"));
	    topLevelClass.addImportedType("com.lz.framework.core.support.IBaseCriteria");
		return super.modelExampleClassGenerated(topLevelClass, introspectedTable);
	}

	@Override
	public boolean sqlMapDocumentGenerated(Document document, IntrospectedTable introspectedTable) {
		XmlElement parentElement = document.getRootElement();

		//鑷姩鐢熸垚namespace
		List<Attribute> list = parentElement.getAttributes();
		 for(int i=0; i<list.size(); i++){
			 Attribute old = list.get(i);
			 if("namespace".equals(old.getName())){
				 Attribute repace = new Attribute("namespace", old.getValue().replaceAll("mapper.", daoPackag+".").replaceAll("Mapper", suffixDao));
				 list.set(i, repace);
				 break;
			 }
		 }

		// 浜х敓鍒嗛〉璇彞鍓嶅崐閮ㄥ垎
		XmlElement paginationPrefixElement = new XmlElement("sql");
		paginationPrefixElement.addAttribute(new Attribute("id", "OracleDialectPrefix"));
		XmlElement pageStart = new XmlElement("if");
		pageStart.addAttribute(new Attribute("test", "pageFlag"));
		pageStart.addElement(new TextElement("select * from ( select row_.*, rownum rownum_ from ( "));
		paginationPrefixElement.addElement(pageStart);
		parentElement.addElement(paginationPrefixElement);

		// 浜х敓鍒嗛〉璇彞鍚庡崐閮ㄥ垎
		XmlElement paginationSuffixElement = new XmlElement("sql");
		paginationSuffixElement.addAttribute(new Attribute("id", "OracleDialectSuffix"));
		XmlElement pageEnd = new XmlElement("if");
		pageEnd.addAttribute(new Attribute("test", "pageFlag"));
		pageEnd.addElement(new TextElement("<![CDATA[ ) row_ where rownum <= #{pageEnd} ) where rownum_ > #{pageStart} ]]>"));

		paginationSuffixElement.addElement(pageEnd);

		parentElement.addElement(paginationSuffixElement);

		return super.sqlMapDocumentGenerated(document, introspectedTable);
	}

	@Override
	public boolean sqlMapSelectByExampleWithoutBLOBsElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {

		XmlElement pageStart = new XmlElement("include"); //$NON-NLS-1$
		pageStart.addAttribute(new Attribute("refid", "OracleDialectPrefix"));
		element.getElements().add(0, pageStart);

		XmlElement isNotNullElement = new XmlElement("include"); //$NON-NLS-1$
		isNotNullElement.addAttribute(new Attribute("refid", "OracleDialectSuffix"));
		element.getElements().add(isNotNullElement);

		return super.sqlMapUpdateByExampleWithoutBLOBsElementGenerated(element, introspectedTable);
	}

	/**
	 *
	 * @param fieldName
	 * @param fieldType
	 * @param topLevelClass
	 * @param comment
	 */
	private void addField(String fieldName, FullyQualifiedJavaType fieldType, TopLevelClass topLevelClass, String comment) {
		Field tmpField = new Field(fieldName, fieldType);
		tmpField.setVisibility(JavaVisibility.PRIVATE);
		if (null != comment) {
			tmpField.addJavaDocLine(comment);
		}
		topLevelClass.addField(tmpField);

		Method setMethod = new Method();
		setMethod.setName("set" + fieldName.toUpperCase().substring(0, 1) + fieldName.substring(1));
		Parameter param = new Parameter(fieldType, fieldName);
		setMethod.addParameter(param);
		setMethod.setVisibility(JavaVisibility.PUBLIC);
		setMethod.addBodyLine("this." + fieldName + "=" + fieldName + ";");
		topLevelClass.addMethod(setMethod);

		Method getMethod = new Method();
		getMethod.setName("get" + fieldName.toUpperCase().substring(0, 1) + fieldName.substring(1));
		getMethod.setReturnType(fieldType);
		getMethod.setVisibility(JavaVisibility.PUBLIC);
		getMethod.addBodyLine("return this." + fieldName + ";");
		topLevelClass.addMethod(getMethod);

	}

	/**
	 * @param topLevelClass
	 * @param introspectedTable
	 * @param name
	 */
	/*
	 * private void addPage(TopLevelClass topLevelClass, IntrospectedTable
	 * introspectedTable, String name) { topLevelClass.addImportedType(new
	 * FullyQualifiedJavaType( "generate.Page")); CommentGenerator
	 * commentGenerator = context.getCommentGenerator(); Field field = new
	 * Field(); field.setVisibility(JavaVisibility.PROTECTED); field.setType(new
	 * FullyQualifiedJavaType("generate.Page")); field.setName(name);
	 * commentGenerator.addFieldComment(field, introspectedTable);
	 * topLevelClass.addField(field); char c = name.charAt(0); String camel =
	 * Character.toUpperCase(c) + name.substring(1); Method method = new
	 * Method(); method.setVisibility(JavaVisibility.PUBLIC);
	 * method.setName("set" + camel); method.addParameter(new Parameter(new
	 * FullyQualifiedJavaType( "generate.Page"), name));
	 * method.addBodyLine("this." + name + "=" + name + ";");
	 * commentGenerator.addGeneralMethodComment(method, introspectedTable);
	 * topLevelClass.addMethod(method); method = new Method();
	 * method.setVisibility(JavaVisibility.PUBLIC); method.setReturnType(new
	 * FullyQualifiedJavaType( "generate.Page")); method.setName("get" + camel);
	 * method.addBodyLine("return " + name + ";");
	 * commentGenerator.addGeneralMethodComment(method, introspectedTable);
	 * topLevelClass.addMethod(method); }
	 */
	/**
	 * This plugin is always valid - no properties are required
	 */
	public boolean validate(List<String> warnings) {
		return true;
	}



}
