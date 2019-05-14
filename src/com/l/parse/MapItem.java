package com.l.parse;

public class MapItem {
	
	/**
	 * struct map_item
		{
		ushort type;
		ushort unuse;
		uint size;
		uint offset;
		}
	 */
	
	public short type;
	public short unuse;//对齐字节
	public int size;
	public int offset;//第一个元素针对文件初始位置的偏移量
	
	public static int getSize(){
		return 2 + 2 + 4 + 4;
	}
	
	@Override
	public String toString(){
		return "type:"+type+",unuse:"+unuse+",size:"+size+",offset:"+offset;
	}

}
