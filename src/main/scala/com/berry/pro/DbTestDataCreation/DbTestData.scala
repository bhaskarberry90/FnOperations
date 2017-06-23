package com.berry.pro.DbTestDataCreation

import scalikejdbc.DBSession
import scalikejdbc._

trait DbTestData {

  def fetchAppInstanceCode(code: String)(implicit session: DBSession): Int = {
    sql"""select *  from System.ApplicationInstance where Code = ${code}"""
      .map(_.int(1))
      .single
      .apply()
      .get
  }

  def fetchApplicationKnajiName(code:String)(implicit session: DBSession):String={

    sql"""select *  from System.ApplicationInstance where Code = ${code}"""
      .map(_.string("InstanceKanjiName")) //we can give both index as well as column name just a note the column index value starts from 1
      .first()
      .apply()
      .get
  }

}
