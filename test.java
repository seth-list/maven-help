/**
 * Check if all tables exist in database
 * @return value of true, if all tables exist, else false
*/
private boolean checkTableExist() {
  Connection con;
  List<String> tablesNames = new ArrayList<>();
  try {
    con = dataSource.getConnection();
    DatabaseMetaData dbmd = con.getMetaData();
    try (ResultSet tables = dbmd.getTables(null, null, "%", new String[] { "TABLE" })) {
        while (tables.next()) {
            tablesNames.add(tables.getString("TABLE_NAME"));
        }
    }
    
  } catch (SQLException e) {
      //add to journal
      logger.debug(ExceptionUtils.getStackTrace(e));
      return false;
  }
  
  for (int i = 0; i < dataTable.size(); i++) {
      if(!tablesNames.contains(dataTable.get(i))) return false;
  }
  return true;
}
