select stu.objid, stu.first_name student_first_name, stu.middle_name student_middle_name,stu.last_name student_last_name, stu.gender,studenticlass(stu.objid) as iclasslevel, studentqclass(stu.objid) as qclasslevel,stu.date_of_birth,fatherid(stu.objid) as f_id,fatherfirstname(stu.objid) as father_firstname,fathermiddlename(stu.objid) as father_middlename,fatherlastname(stu.objid) as father_lastname, motherid(stu.objid) as m_id,motherfirstname (stu.objid) as mother_firstname,mothermiddlename (stu.objid) as mother_middlename, motherlastname (stu.objid) as mother_lastname,cellnumber(stu.objid) as cell_number, homephone(stu.objid) as home_phone_number, email(stu.objid) as email from iae_wis.wis_students stu order by objid asc;
