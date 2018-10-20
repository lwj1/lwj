package com.shana.dao;

import com.shana.model.Resume;

/**
 * Created by Administrator on 2018/10/19.
 */
public interface ResumeDao {
    int addResume(Resume resume);
    Resume findResumeByVid(int vid);
    int UpdateResumeByVid(Resume resume);
    int deleteResumeByVid(int vid);
}
