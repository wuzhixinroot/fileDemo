package com.wuzhixin.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface DownLoadFileService {

   void downloadFile(HttpServletRequest req, HttpServletResponse res,String str);
}
