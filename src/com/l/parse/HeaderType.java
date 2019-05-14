package com.l.parse;

import com.l.Utils;

/**
 * Created by Lemniscate on 2019/5/13.
 * <p>
 * struct header_item
 * {
 * ubyte[8] magic;
 * unit checksum;
 * ubyte[20] siganature;
 * uint file_size;
 * uint header_size;
 * unit endian_tag;
 * uint link_size;
 * uint link_off;
 * uint map_off;
 * uint string_ids_size;
 * uint string_ids_off;
 * uint type_ids_size;
 * uint type_ids_off;
 * uint proto_ids_size;
 * uint proto_ids_off;
 * uint method_ids_size;
 * uint method_ids_off;
 * uint class_defs_size;
 * uint class_defs_off;
 * uint data_size;
 * uint data_off;
 * }
 */
public class HeaderType {
    public byte[] magic = new byte[8];//常量 为了能让dex文件能够被识别出来(dex\n035\0)  035是dex版本
    public int checksum;//文件校验码 alder32算法校验文件除去magic checksum外余下的所有文件区域，用于检查文件错误
    public byte[] siganature = new byte[20];//使用sha-1算法hash除去magic checksum signature外余下的所有文件区域，用于唯一识别本文件
    public int file_size;
    public int header_size;//一般固定为0x70常量
    public int endian_tag;//大小端标签 标准dex文件为小端 此项一般固定为0x12345678常量
    public int link_size;//链接大小
    public int link_off;//链接偏移值
    public int map_off;//map item的偏移地址 该item属于data区里的内值要大于等于data_off的大小
    public int string_ids_size;
    public int string_ids_off;
    public int type_ids_size;
    public int type_ids_off;
    public int proto_ids_size;//元数据信息 比如方法的返回类型 参数类型等信息
    public int proto_ids_off;
    public int field_ids_size;//字段信息数据结构的大小和偏移值
    public int field_ids_off;
    public int method_ids_size;
    public int method_ids_off;
    public int class_defs_size;
    public int class_defs_off;
    public int data_size;
    public int data_off;

    @Override
    public String toString() {
        return "magic:" + Utils.bytesToHexString(magic) + "\n"
                + "checksum:" + checksum + "\n"
                + "siganature:" + Utils.bytesToHexString(siganature) + "\n"
                + "file_size:" + file_size + "\n"
                + "header_size:" + header_size + "\n"
                + "endian_tag:" + endian_tag + "\n"
                + "link_size:" + link_size + "\n"
                + "link_off:" + Utils.bytesToHexString(Utils.int2Byte(link_off)) + "\n"
                + "map_off:" + Utils.bytesToHexString(Utils.int2Byte(map_off)) + "\n"
                + "string_ids_size:" + string_ids_size + "\n"
                + "string_ids_off:" + Utils.bytesToHexString(Utils.int2Byte(string_ids_off)) + "\n"
                + "type_ids_size:" + type_ids_size + "\n"
                + "type_ids_off:" + Utils.bytesToHexString(Utils.int2Byte(type_ids_off)) + "\n"
                + "proto_ids_size:" + proto_ids_size + "\n"
                + "proto_ids_off:" + Utils.bytesToHexString(Utils.int2Byte(proto_ids_off)) + "\n"
                + "field_ids_size:" + field_ids_size + "\n"
                + "field_ids_off:" + Utils.bytesToHexString(Utils.int2Byte(field_ids_off)) + "\n"
                + "method_ids_size:" + method_ids_size + "\n"
                + "method_ids_off:" + Utils.bytesToHexString(Utils.int2Byte(method_ids_off)) + "\n"
                + "class_defs_size:" + class_defs_size + "\n"
                + "class_defs_off:" + Utils.bytesToHexString(Utils.int2Byte(class_defs_off)) + "\n"
                + "data_size:" + data_size + "\n"
                + "data_off:" + Utils.bytesToHexString(Utils.int2Byte(data_off));


    }

}
