package com.spring.spring28ex.dao;
import java.util.ArrayList;
import org.springframework.validation.Validator;
import com.spring.spring28ex.dto.ContentDto;

public interface IDao extends Validator {

	public ArrayList<ContentDto> listDao();
	public  void writeDao(String mWriter, String mContent);
	public void deleteDao(String mId);
}
