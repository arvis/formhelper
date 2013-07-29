package com.viestards.formhelper;

public class TextAreaField extends BaseField{

	private int rows=3;
	private int cols=40;

	public TextAreaField(String name, String value) {
		super(name, value);
	}


	@Override
	public String getField() {
		return String.format("<textarea name='%s' id='%s' rows='%s' cols='%s'>%s</textarea>",
				getName() ,getName(),rows,cols,getValue() );
	}
	
	public int getRows(){
		return rows;
	}
	
	public void setRows(int rows){
		this.rows=rows;
	}
	
	public int getCols(){
		return cols;
	}
	
	public void setCols(int cols){
		this.cols=cols;
	}
	

}
