package com.jambo.tools.codegen.util;

public interface Constants {
    String WIZARDNAME = "�����Զ�������";
    String srcFolder = "";
    String testFolder = "";
    String moduleName = "admin";
    final String[] hibernateKeyFields = {
            "long", "int", "date", "string", "timestamp"
        };
    final String[] javaKeyFields = {
            "java.lang.Long", "java.lang.Integer", "java.util.Date",
            "java.lang.String", "java.sql.Timestamp"
        };
    final String[] schemaExport = {
            "assigned", "native", "uuid.hex", "uuid.string", "vm.long", "vm.hex",
            "sequence", "hilo.long", "hilo.hex", "seqhilo.long"
        };
    final String[] tableTypes = { "TABLE", "VIEW", "SYNONYM", "ALIAS" };
//    String BaseDaoClass = "com.sunrise.boss.common.base.db.BaseDAO";
    String BaseDaoClass = "com.jambo.jop.infrastructure.db.AbstractDAO";
    
	final String[] columnNames = { "name", "n", "nn", "l", "nm",
			"e", "nl", "m", "ne", "in", "nin", "k", "nk" };

	final String[] columnHeaders = { "�ֶ�����", "��", "�ǿ�", "<",
			"<=", "=", ">=", ">", "<>", "IN", "NOT IN", "LIKE", "NOT LIKE" };
	
	public static final int MAX_CHECK_NUMBER = 10;
	
	public static final int HBM = 0;
	public static final int VO = 1;
	public static final int QUERYPARAM = 2;
	public static final int DAO = 3;
	public static final int EJB = 4;
	public static final int WEB = 5;
	public static final int PAGE = 6;
	public static final int TEST = 7;
	public static final int I18N = 8;
	public static final int DUBBO = 9;
//	public static final int DELEGATE = 5;
	
	final String[] labelsWhich = {"Hbm�ļ�", "VO(POJO)", "QueryParam(��ѯ����)",
			"DAO(�����߼�)", "BO(ҵ���߼�)", "Action��(ҳ���߼�)", "ҳ���ļ�(JSP)", "������", "���ʻ��ļ�", "DUBBO����"};
//	"������", 
}
