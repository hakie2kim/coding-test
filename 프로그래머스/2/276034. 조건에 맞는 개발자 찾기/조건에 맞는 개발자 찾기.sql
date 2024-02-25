SELECT DISTINCT d.ID, d.EMAIL, d.FIRST_NAME, d.LAST_NAME
FROM DEVELOPERS d, SKILLCODES s
WHERE 
    (d.SKILL_CODE & s.CODE) IN ( -- 비트연산자로 일치하면 CODE와 같은 숫자가 나옴
        SELECT CODE 
        FROM SKILLCODES 
        WHERE NAME IN ('Python', 'C#')
    )
ORDER BY 1;