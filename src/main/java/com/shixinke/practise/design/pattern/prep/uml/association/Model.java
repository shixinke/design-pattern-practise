package com.shixinke.practise.design.pattern.prep.uml.association;

/**
 * 数据库操作模型
 * @author shixinke
 */
public class Model {
    private DbConnection dbConnection;

    public Model(DbConnection connection) {
        this.dbConnection = connection;
    }

    /**
     * 插入操作
     * @return
     */
    public boolean insert() {
        this.dbConnection.execute("INSERT INTO....");
        return true;
    }
}
