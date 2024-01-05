-- Single quotes are used to denote string literals in SQL
-- Double quotes, on the other hand, are used to specifically denote identifiers such as table names, column names, or aliases that are case-sensitive or contain special characters or spaces

SELECT ROUND(AVG(DAILY_FEE)) AS AVERAGE_FEE
FROM CAR_RENTAL_COMPANY_CAR
WHERE CAR_TYPE = 'SUV'
;