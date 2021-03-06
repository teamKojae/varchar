package com.varchar.www.model.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.varchar.www.model.domain.page.Criteria;
import com.varchar.www.model.domain.record.Record;

public interface RecordDAO {

	List<Record> getRecordList();
	List<Record> getStudentRecord(String userId);
	void insertRecord(Record record);
	void deleteRecord(String recordNo);
}
