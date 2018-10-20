package com.shana.service;

import com.shana.model.Resume;

/**
 * Created by Administrator on 2018/10/20.
 */
public interface ResumeService {

    boolean addResume(Resume resume);
    Resume findResumeByVid(int vid);
    boolean UpdateResumeByVid(Resume resume);
    boolean deleteResumeByVid(int vid);
}
