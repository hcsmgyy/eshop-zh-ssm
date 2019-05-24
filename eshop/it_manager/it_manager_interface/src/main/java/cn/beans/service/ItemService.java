package cn.beans.service;

import cn.beans.common.pojo.EasyUIDataGridResult;
import cn.beans.pojo.TbItem;

public interface ItemService {
    TbItem getItemById(long itemId);
    EasyUIDataGridResult getItemList(int page,int rows);
}
