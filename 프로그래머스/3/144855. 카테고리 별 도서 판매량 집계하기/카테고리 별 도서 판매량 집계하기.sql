SELECT b.CATEGORY, SUM(bs.SALES) AS TOTAL_SALES
FROM BOOK b
JOIN BOOK_SALES bs ON b.BOOK_ID = bs.BOOK_ID
WHERE bs.SALES_DATE >= '2022-01-01' && '2022-02-01' > bs.SALES_DATE
GROUP BY b.CATEGORY
ORDER BY b.CATEGORY