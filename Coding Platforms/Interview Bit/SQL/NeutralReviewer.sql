select distinct reviewer_name from reviewers 
where reviewer_id in (select reviewer_id from ratings where reviewer_stars is NULL)


/*INTERVIEW BIT SOLUTION*/
SELECT r.reviewer_name as reviewer_name from reviewers r
INNER JOIN ratings rt
ON rt.reviewer_id = r.reviewer_id
WHERE rt.reviewer_stars IS NULL;