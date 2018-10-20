package com.shana.service.impl;

import com.shana.dao.ResumeDao;
import com.shana.model.Resume;
import com.shana.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/10/20.
 */
@Service
public class ResumeServiceImpl implements ResumeService {
    @Autowired
    private ResumeDao resumeDao;
    public boolean addResume(Resume resume) {
        if(resumeDao.addResume(resume)!=0){
            return true;
        }else {
            return false;
        }
    }

    public Resume findResumeByVid(int vid) {
        return resumeDao.findResumeByVid(vid);
    }

    public boolean UpdateResumeByVid(Resume resume) {
        if(resumeDao.UpdateResumeByVid(resume)!=0){
            return true;
        }else {
            return false;
        }
    }

    public boolean deleteResumeByVid(int vid) {
        if(resumeDao.deleteResumeByVid(vid)!=0){
            return true;
        }else {
            return false;
        }
    }
}
