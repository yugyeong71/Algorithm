SELECT d.ID, d.EMAIL, d.FIRST_NAME, d.LAST_NAME
FROM DEVELOPERS d
WHERE d.SKILL_CODE & (SELECT CODE 
                      FROM SKILLCODES s
                      WHERE s.NAME IN ('Python')) > 0 OR
      d.SKILL_CODE & (SELECT CODE 
                      FROM SKILLCODES s
                      WHERE s.NAME IN ('C#')) > 0 
ORDER BY d.ID