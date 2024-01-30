-- LEFT OUTER JOIN: outs과 ins 테이블의 행이 일치하는 경우가 없더라도 outs의 행이 표현됨
-- -> 입양은 갔지만 들어온 기록이 없는 경우
SELECT o.ANIMAL_ID, o.NAME
FROM ANIMAL_OUTS o
LEFT OUTER JOIN ANIMAL_INS i
ON o.ANIMAL_ID = i.ANIMAL_ID
WHERE i.ANIMAL_ID IS NULL
ORDER BY 1;